
public class Pyramid
{
    public Pyramid()
    {
    }
    public static void pyramid(int numberOfRows){

    int curentAmountOfStars = 1; // first row has one star
    for(int i = 0; i < numberOfRows; i++){

        for(int j=0; j<numberOfRows-i-1;j++){ // this for prints spaces
            System.out.print(" ");
        }

        for(int j= curentAmountOfStars; j>0; j--){ //this one prints stars
            System.out.print("*");
        }
        System.out.println(); //go to new row
        curentAmountOfStars += 2; // increase amount of stars
    }

}
}
