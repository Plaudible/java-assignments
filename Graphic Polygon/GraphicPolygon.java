import gpdraw.*;
import java.lang.Math.*;
/**
 * Maxwell Bockmann
 * Money money make it rain
 * Draws a polygon, extends the class Regular Polygon
 */
class GraphicPolygon extends Polygon
{
      private DrawingTool pen = new DrawingTool(new SketchPad(400, 400));
      private double xPosition, yPosition, myr, mySideLength;
      private int myNumSides;
      /**
       * Constructor for class Graphic Polygon
       */
      public GraphicPolygon(int numSides, double sideLength){
          super(numSides, sideLength);
          myNumSides = numSides;
          mySideLength = sideLength;
          myr= calcr();
          xPosition = 0;
          yPosition = 0;
      }
      /**
       * Constructs a polygon with center (x,y)
       */
      public GraphicPolygon(int numSides, double sideLength, double x, double y){
          super(numSides, sideLength);
          myNumSides = numSides;
          mySideLength = sideLength; 
          myr = calcr();
          xPosition = x;
          yPosition = y;
      }
      /**
       * Moves the center to (x,y)
       */
      public void moveTo(double x, double y){
          xPosition = x;
          yPosition = y;
      }
      /**
       * Draws the polygon 
       */
      public void draw(){
          pen.up();
          pen.move(xPosition, yPosition);
          pen.forward(myr);
          pen.down();
          pen.turnRight();
          pen.forward((double)mySideLength/2);
          for(int s = 0;s<myNumSides;s++)
          {
              pen.turnRight(180-vertexAngle());
              pen.forward(mySideLength);
          }
      }
}

