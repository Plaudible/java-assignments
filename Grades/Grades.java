
public class Grades {
    char grade1;
    char grade2;
    char grade3;
    char grade4;
    char grade5;
    char grade6;
    char grade7;
    char grade8;
    public double grades(double GPA){
        
    if ( GPA == 4.0){
        System.out.println("Eligible");
 
    }
    else if (GPA >= 3.0){
                System.out.println("Eligible");
    }
 
    else if (GPA >= 2.0 ){
                System.out.println("Eligible");
    }
 
    else if (GPA >= 1.0 ){
                System.out.println("Ineligible by GPA, GPA under 2.0");
    }
    else if (GPA == 0){
        System.out.println("Ineligible by GPA, child is failure. Try restarting it and buying another one at Costco.");
    }
    return GPA; 
}
    public int classes(int classes){
    if (classes < 4){
     System.out.println("Ineligible by class count, less than 4 classes.");
     }
     else if (classes >= 4){
     System.out.println("Eligible by class count, more than 4 classes.");   
     }
     return classes;
}
}