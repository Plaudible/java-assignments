import gpdraw.*;
public class Kochcurve
{
    public DrawingTool myPencil;
    public SketchPad myPaper;
    public Kochcurve()
    {
       myPaper=new SketchPad(1000, 1000);
       myPencil=new DrawingTool(myPaper);
    }
    public void drawKochcurve(double level, double length)
    {
        if (level < 1){
            myPencil.move(length);
            //add length
        }
            else
            {
                drawKochcurve(level - 1, (length) / 3);
                myPencil.turnLeft(60);
                drawKochcurve(level - 1, (length) / 3);
                myPencil.turnRight(120);
                drawKochcurve(level - 1, (length) / 3);
                myPencil.turnLeft(60);
                drawKochcurve(level - 1, (length) / 3);
                
            
            }
    }     
    }

