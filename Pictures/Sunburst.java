import gpdraw.*;
import java.util.Random;
import java.awt.Color;
public class Sunburst
{
    DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
    double x;
    public void drawSunburst()
    {
    for(x=0; x<360; x=x+0.25){
            pen.turn(x);
            pen.move(200);    
            pen.up();
            pen.move(0,0);
            pen.down();
    }
}
}