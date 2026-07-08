package Task2;

public class Course {
  public String title;
  public String code;
  public int credit;
  
  public void displayCourse(){
    System.out.println("Course Name: "+this.title);
    System.out.println("Course Code: "+this.code);
    System.out.println("Course Credit: "+this.credit);
  }

  public void updateDetails(String title, String code, int credit){
    this.title = title;
    this.code = code;
    this.credit = credit;
  }

}
