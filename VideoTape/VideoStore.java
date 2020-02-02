import java.util.*;
import java.io.*;
public class VideoStore
{
    static final int MAX_VIDEOS = 5;
    private VideoTape[] videoTapes = new VideoTape[MAX_VIDEOS];
    private int numVideos = 0;
    Scanner input = new Scanner(System.in);
    static final String FILENAME = "videos.txt";
    
    public static void main(String[] args)
    {
        new VideoStore();
    }

    public VideoStore()
    {
        char command;
        if (checkForFile())
        {
            System.out.println("data file located and loaded with " + numVideos + " existing records \n");
        }
        else
        {
            System.out.println("No data file found\n");
        }
        do
        {
            command = getCommand();
            doCommand(command);
        }
        while (command!= 'q');
    } 

    private char getCommand()
    {
        String tempChar;
        char ch;

        do
        {
            System.out.println("Would you like to: ");
            System.out.println(" (a) add a video tape to the collection");
            System.out.println(" (l) list the tapes already in the collection");
            System.out.println(" (s) save the tapes to a data file");
            System.out.println(" (u) upload videos from a data file");
            //System.out.println(" (c) clear videos from loaded data");
            System.out.println(" (q) quit the program");
            System.out.println("");
            tempChar = input.next();
            tempChar = tempChar.toLowerCase();
            ch = tempChar.charAt(0);

            if (ch == 0)
            {
                System.out.println("Please enter a valid command");
                ch = 'n';
            }
            else if ((ch != 'a') && (ch != 'q') && (ch != 'l') && (ch != 's') && (ch != 'u') && (ch != 'c'))
            {
                System.out.println("Please enter a valid command");
                ch = 'n';
            }        
        }    
        while (ch == 'n');

        return ch;
    }

    private void doCommand(char command)
    {
        if(command == 'a')
        {
            if (numVideos >= MAX_VIDEOS)
            {
                System.out.println("Sorry, no more videos can be stored");
            }
            else
            {
                videoTapes[numVideos] = getVideoDetails();
                numVideos ++;
            }
        }
        else if(command == 'l')
        {
            for(int x = 0; x < numVideos; x ++)
            {
                System.out.println("" + ": " + videoTapes[x].toString());
            }
        }
        else if(command == 's')
        {
            System.out.println("Saving Files");
            fileWriter();
        }
        else if(command == 'u')
        {
            System.out.println("Loading Files");
            checkForFile();
        }
        /**
         * else if(command == 'c')
        {
        System.out.println("Deleting Files");

        for(int x = 0; x < numVideos; x++)
        {
        videoTapes[x].setTitle(null);
        videoTapes[x].setLength(0);
        videoTapes[x].setBoolean(false);
        }
        }
         */
        else if(command == 'q')
        {
            System.out.println("Bye then");
        }
        else
        {
            System.out.println("Some internal error in doCommand");
        }
    }

    private VideoTape getVideoDetails()
    {
        System.out.println("Enter the title of your video, replacing spaces with \"_\" : ");
        String title = input.next();
        System.out.println("Enter the length of the video in minutes: ");
        int length = input.nextInt();
        return new VideoTape(title, length, false);
    }

    private void fileWriter()
    {
        try
        {
            FileWriter theFileID = new FileWriter(FILENAME);
            PrintWriter outFile = new PrintWriter(theFileID);

            for(int x = 0; x < numVideos; x ++)
            {
                outFile.println(videoTapes[x].getTitle());
                outFile.println(videoTapes[x].getLength());
                outFile.println(videoTapes[x].getLent());
            }
            outFile.close();
        }
        catch (IOException writeException)
        {
            System.out.println("Error writing to the data file");
        }
    }

    private boolean checkForFile()
    {
        try
        {
                FileReader fR = new FileReader(FILENAME);
           
                BufferedReader in = new BufferedReader(fR);
                String line;
                int length;
                boolean lent;
                int x = 0;
                while((line = in.readLine()) != null)
                {   
                    length = Integer.parseInt(in.readLine());
                    lent = Boolean.getBoolean(in.readLine());
                    videoTapes[x]=new VideoTape(line,length,lent);                    
                    x++;
                }
                numVideos = x;
                fR.close();
                return true;
        }
        
        catch(IOException fileNotFound)
        {
            System.out.println("File not found");
            return false;
        }
    }
}
