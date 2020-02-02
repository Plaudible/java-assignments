import gpdraw.*;
/**
 * They say it don't be like it is, but it do.
 * 
 * PHALANGE RAVE
 * KAWAII
 */
public class Ponzo
{
    private DrawingTool myPencil;
    private SketchPad myPaper;
    /**
     * Constructor for objects of class Ponzo
     */
    public Ponzo()
    {
       myPaper=new SketchPad(500, 500);
       myPencil=new DrawingTool(myPaper);
    }

    /**
     * How much would could a wood chuck chuck if a wood chuck could chuck wood?
     * 
     * NO ONE ASKED.
     * \(^-^/)
     */
    public void draw()
    {
        myPencil.up();
        myPencil.move(-250,0);
        myPencil.down();
        myPencil.move(250,0);
        myPencil.up();
        myPencil.move(-250,10);
        myPencil.down();
        myPencil.move(250,50);
        myPencil.up();
        myPencil.move(-250,-10);
        myPencil.down();
        myPencil.move(250,-50);
        myPencil.up();
        myPencil.move(-250,20);
        myPencil.down();
        myPencil.move(250,120);
        myPencil.up();
        myPencil.move(-250,-20);
        myPencil.down();
        myPencil.move(250,-120);
        myPencil.up();
        myPencil.move(-250,30);
        myPencil.down();
        myPencil.move(250,180);
        myPencil.up();
        myPencil.move(-250,-30);
        myPencil.down();
        myPencil.move(250,-180);
        myPencil.up();
        myPencil.move(-250,40);
        myPencil.down();
        myPencil.move(250,250);
        myPencil.up();
        myPencil.move(-250,-40);
        myPencil.down();
        myPencil.move(250,-250);
        myPencil.up();
        myPencil.move(-50,-160);
        myPencil.down();
        myPencil.move(-50,160);
        myPencil.up();
        myPencil.move(50,-160);
        myPencil.down();
        myPencil.move(50,160);

    }
}