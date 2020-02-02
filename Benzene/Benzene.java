import gpdraw.*;
/**
 * This draws a benzene. Yay.
 * 
 * Maxwell Bockmann
 * 9/3/2014
 */
public class Benzene
{
    // instance variables - replace the example below with your own
    private DrawingTool myPencil;
    private SketchPad myPaper;
    /**
     * Constructor for objects of class Benzene
     */
    public Benzene()
    {
        // initialise instance variables
       myPaper=new SketchPad(500, 500);
       myPencil=new DrawingTool(myPaper);
    }

    /**
     * Apple bottom jeans.
     * Boots with the fur.
     * The whole club was starin' at her.
     * She hit the floor.
     */
    public void draw()
    {
        // put your code here
        myPencil.up();
        myPencil.move(0,0);
        myPencil.down();
        myPencil.drawCircle(100);
        myPencil.up();
        myPencil.move(0,-160);
        myPencil.down();
        myPencil.turn(120);
        myPencil.move(160);
        myPencil.turn(60);
        myPencil.move(160);
        myPencil.turn(60);
        myPencil.move(160);
        myPencil.turn(60);
        myPencil.move(160);
        myPencil.turn(60);
        myPencil.move(160);
        myPencil.turn(60);
        myPencil.move(160);
    }
}
