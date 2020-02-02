
import gpdraw.*;
public class Turn
{
    private DrawingTool myPencil;
    private SketchPad myPaper;
    public Turn()
    {
       myPaper=new SketchPad(1000, 1000);
       myPencil=new DrawingTool(myPaper);
    }
    public static void main(String[] args)
    {
        Kochcurve curve = new Kochcurve();
        curve.drawKochcurve(6, 300);
        curve.myPencil.turnLeft(60);
        curve.drawKochcurve(6, 300);
        curve.myPencil.turnLeft(60);
        curve.drawKochcurve(6, 300);
        curve.myPencil.turnLeft(60);
        curve.drawKochcurve(6, 300);
        curve.myPencil.turnLeft(60);
        curve.drawKochcurve(6, 300);
        curve.myPencil.turnLeft(60);
        curve.drawKochcurve(6, 300);
    }
}
