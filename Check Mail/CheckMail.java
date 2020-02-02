
import java.util.Scanner;
/**
 * This is swag.
 * 
 * @author (Maxime Beauchamp) 
 * @version (Dorian stop trying to cheat off of me)
 */

    public class CheckMail {
    double myHeight;
    double myLength;
    double myWidth;
    double myWeight;
    double myGirth;
    Scanner in = new Scanner(System.in);
        /**
        * What is love? Baby don't hurt me, don't hurt me, no moar.
        */
         public CheckMail(double d1, double d2, double d3, double wt){
          myLength=d1;
          myHeight=d2;
          myWidth=d3;
          myWeight=wt;
         }
        public void calculateValid(){
            if ((myGirth+myLength>=100)&&(myWeight>=70)){
                System.out.println("The package is too large and too heavy");
            }
                else 
                    if ((myGirth+myLength>=100)){
                    System.out.println("The package is too large");
                }
                    else 
                        if ((myWidth>=70)){
                            System.out.print("The package is too heavy");
                        }
                        else
                            System.out.println("The package is fine");
        }  
        public void calculateGirth(){
           double myGirth=(2*myHeight)+(2*myWidth);
           System.out.println("The girth of the package is "+myGirth);
        }
    }
