import java.util.Scanner;  
import java.io.*;
 public class Compact{
            public void printList(int[] list){
              for(int index = 0; index < list.length; index++){
               System.out.print(list[index]+"  ");
              }
              System.out.println();
            
              int nonZeroSize = 0;
              int last = list.length;
              for(int i = 0; i < last; ++i) {
              if(list[i] == 0) {
	            -- last;
              for(int j = i; j < last; ++j) {
	                list[j] = list[j+1];
	            }
	            i--;
              }
              else {
              ++nonZeroSize;             
	         }
	        }
    
            for(int i = 0; i < nonZeroSize; ++i)
	        System.out.print(" " + list[i]);
            //May move this to I would put that code just after the System.out.println(); of your printList() method 
       }
       public int[] getArray(){
            int value;
            int count = 0;
            int[] scannedArray = new int[getListSize()];
            Scanner in;
            try{
                in = new Scanner(new File("Z:/Intermediate Programming/BlueJ Projects/Semester 2/compact.txt")); 
                while(in.hasNextInt()){
                  value = in.nextInt();
                   scannedArray[count] = value;
                  count++;
                }
                }    
            catch(IOException z){
            System.out.println("File Not Found");
            }
            return scannedArray;
        }         
            public static int getListSize(){
            int count = 0;
                Scanner readText;
                try{
                  readText = new Scanner(new File("Z:/Intermediate Programming/BlueJ Projects/Semester 2/compact.txt"));
                   while(readText.hasNextInt()){
                   count++;
                   readText.nextInt();
                          }
                   }
            catch(IOException z){
                System.out.println("File not found");
            }
            return count;
        }
    }