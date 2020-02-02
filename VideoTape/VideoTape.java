
public class VideoTape
{
    private String title;
    private int length;
    private boolean lent;

    public VideoTape()
    {
        this.title = null;
        this.length = 0;
        this.lent = false;
    }

    public VideoTape(String title, int length, boolean lent)
    {       
        this.title = title;
        this.length = length;
        this.lent = lent;
    }

    public void setTitle(String title)
    {
        if(title == "null")
        {
            this.title = null;
        }
        else
        {
            this.title = title;
        }
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public void setBoolean(boolean lent)
    {
        this.lent = lent;
    }

    public String getTitle()
    {
        return this.title;
    }

    public int getLength()
    {
        return this.length;
    }

    public boolean getLent()
    {
        return this.lent;
    }
    
    public String toString()
    {
        return this.title + " " + this.length + " " + this.lent + "\n";
    }
}
