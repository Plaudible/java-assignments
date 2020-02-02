
 public class Teacher extends Person{
      private String mySubject; // Student Id Number
      private double mySalary; // grade point average

      // constructor
      public Teacher(String name, int age, String gender,
                String subject, double salary){
        // use the super class' constructor
        super(name, age, gender);

        // initialize what's new to Student
        mySubject = subject;
        mySalary = salary;
      }

      public String getSubject(){
        return mySubject;
      }

      public double getSalary(){
        return mySalary;
      }

      public void setSubject(String Subjects){
        mySubject = Subjects;
      }

      public void setSalary(double salary){
        mySalary = salary;
      }

      // overrides the toString method in the parent class
      public String toString(){
        return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
      }
    }
