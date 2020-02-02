
/**
 * /r/potatosalad
 * /r/JohnCena
 * @Some hooman 
 * @When the sun dies
 */
public class Car
{
    // instance variables - replace the example below with your own
    private int myStartMiles;
    private int myEndMiles;
    private double myGallonsUsed;
     public Car(int odometerReading)
    {
      myStartMiles = odometerReading;
      myEndMiles = myStartMiles;
      myGallonsUsed = 0;
    }
     public double calculateMPG(){
      return (myEndMiles - myStartMiles)/myGallonsUsed;
    }
    public double resetMPG(){
      myStartMiles = myEndMiles;
      myGallonsUsed = 0;
      return myStartMiles;
    }
    public void fillUp (int odometerReading, double gallons){
      myEndMiles = odometerReading;
      myGallonsUsed += gallons; 
    } 
}