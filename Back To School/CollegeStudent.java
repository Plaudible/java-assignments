
  public class CollegeStudent extends Student{
      private String myMajor;
      private double myYear; 

      // constructor
      public CollegeStudent(String name, int age, String gender,
                String idNum, double gpa,double year,String major){
        // use the super class' constructor
        super(name, age, gender, idNum, gpa);

        // initialize what's new to Student
        myYear = year;
        myMajor = major;
      }

      public String getMajor(){
        return myMajor;
      }

      public double getYear(){
        return myYear;
      }

      public void setMajor(String Major){
        myMajor = Major;
      }

      public void setYear(double Year){
        myYear = Year;
      }

      // overrides the toString method in the parent class
      public String toString(){
        return super.toString() + ", Year: " + myYear + ", Major: "+ myMajor;
      }
    }
