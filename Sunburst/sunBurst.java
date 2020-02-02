import java.lang.Math;
import java.awt.*;
import gpdraw.*;
public class sunBurst{

    public static void burst(){
        DrawingTool pen = new DrawingTool(new SketchPad(700, 700));
        pen.up(); pen.move(0, 0); pen.down();
        int r = 0;
        int g = 0;
        int b = 0;
        for (int burst = 0; burst <= 99999; burst++){
            pen.setColor(new Color(r, g, b));
            pen.forward(2500);
            pen.up(); pen.move(0, 0); pen.down();
            pen.turnRight(Math.PI);
            r += 59; g +=73; b +=61;
            r = r%255; g = g%255; b = b%255;
        }
    }

}