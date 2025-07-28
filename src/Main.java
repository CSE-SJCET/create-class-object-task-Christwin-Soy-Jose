     public class Student{
          String name;
          int rollNumber;
          char grade;
     }
     void displayDetails(){
          System.out.println("Name:"+name);
          System.out.println("Grade:"+grade);
          System.out.println("rollnumber:"+rollNumber);
     }
          
    public class Main {
      public static void main(String[] args) {
        Student student1= new Student("chris",28,"A");
          student1.displayDetails();
    }
}
