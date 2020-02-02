import gpdraw.*;
public class parrallellines
{
    private DrawingTool pen;
    private SketchPad paper;
    int startx = -320;
    int starty = 199;
    public parrallellines()
    {
        paper=new SketchPad(650,500);
        pen = new DrawingTool(paper);
        
    }

    
    public void draw()
    {
        
        for(int num = 0; num < 12; num++){
           for(int row = 0; row < 12; row++){
              pen.up();
              pen.move(-300,199);
              pen.down();
              startx = startx + 80;
              for (int col = 0; col < 7; col++){
                 pen.fillRect(40,40);
                 pen.up();
                 pen.move(startx+20,starty);
                 pen.down();
              }
              
           }
           pen.up();
           pen.move(-350,180);
           pen.down();
           pen.move(350,180);
           
           pen.up();
           pen.move(-350,140);
           pen.down();
           pen.move(350,140);
           
           pen.up();
           pen.move(-350,100);
           pen.down();
           pen.move(350,100);
           
           pen.up();
           pen.move(-350,60);
           pen.down();
           pen.move(350,60);
           
           pen.up();
           pen.move(-350,20);
           pen.down();
           pen.move(350,20);
           
           pen.up();
           pen.move(-350,-20);
           pen.down();
           pen.move(350,-20);
           
           pen.up();
           pen.move(-350,-60);
           pen.down();
           pen.move(350,-60);
           
           pen.up();
           pen.move(-350,-100);
           pen.down();
           pen.move(350,-100);
           
           pen.up();
           pen.move(-350,-140);
           pen.down();
           pen.move(350,-140);
           
           pen.up();
           pen.move(-350,-180);
           pen.down();
           pen.move(350,-180);
           starty=starty-40;
           if ((num % 2)==0){
               startx = -380;
            }else{
                startx = -400;
            }
        }
    }
}
