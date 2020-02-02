import gpdraw.*;
public class House
{
    private DrawingTool myPencil;
    private SketchPad myPaper;
    public House()
    {
       myPaper=new SketchPad(500, 500);
       myPencil=new DrawingTool(myPaper);
    }
    public void draw()
    {
        myPencil.up();
        myPencil.move(200,0);
        myPencil.down();
        myPencil.move(200,-200);
        myPencil.move(-200,-200);
        myPencil.move(-200,0);
        myPencil.move(200,0);
        myPencil.move(0,200);
        myPencil.move(-200,0);
        myPencil.up();
        myPencil.move(20,-200);
        myPencil.down();
        myPencil.move(-20,-200);
        myPencil.move(-20,-140);
        myPencil.move(20,-140);
        myPencil.move(20,-200);
        myPencil.up();
        myPencil.move(150,-50);
        myPencil.down();
        myPencil.move(100,-50);
        myPencil.move(100,-100);
        myPencil.move(150,-100);
        myPencil.move(150,-50);
        myPencil.up();
        myPencil.move(-150,-50);
        myPencil.down();
        myPencil.move(-100,-50);
        myPencil.move(-100,-100);
        myPencil.move(-150,-100);
        myPencil.move(-150,-50);
    }
}
