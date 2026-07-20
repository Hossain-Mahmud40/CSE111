package Task4;

public class Student {
  public String name;
  public int id;
  public String department; 
  public String email;
  public String password;
  public boolean isLoggedIn;
  public String[] courses = new String[3];
  public int count;

  public Student(String name, int id, String department){
    this.name = name;
    this.id = id;
    this.department = department;
    System.out.println("Student object is created");
  }
  
}
