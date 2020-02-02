import gpdraw.*;
/**
 * I am not going to write a descrption because in Latvia there is no potato only malnorish.
 * 
 * @Maxwell Piggywiggins
 * @9/22/14
 */
public class Muller
{
    private DrawingTool myPencil;
    private SketchPad myPaper;
    /**
     * Constructor for objects of class Muller
     */
    public Muller()
    {
       myPaper=new SketchPad(500, 500);
       myPencil=new DrawingTool(myPaper);
    }

    /**
     * Shut up you smell like pudding
     * @wutz a parameter lel
     * @return something that's so kawaii my face melts and becomes an apple. 
     */
    public void draw()
    {
        myPencil.up();
        myPencil.move(-100,100);
        myPencil.down();
        myPencil.move(100,100);
        myPencil.move(120,110);
        myPencil.move(100,100);
        myPencil.move(120,90);
        myPencil.move(100,100);
        myPencil.move(-100,100);
        myPencil.move(-120,110);
        myPencil.move(-100,100);
        myPencil.move(-120,90);
        myPencil.up();
        myPencil.move(-100,-100);
        myPencil.down();
        myPencil.move(100,-100);
        myPencil.move(80,-90);
        myPencil.move(100,-100);
        myPencil.move(80,-110);
        myPencil.move(100,-100);
        myPencil.move(-100,-100);
        myPencil.move(-80,-90);
        myPencil.move(-100,-100);
        myPencil.move(-80,-110);
    }
}
