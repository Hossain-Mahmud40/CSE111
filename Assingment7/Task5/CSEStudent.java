package Task5;

public class CSEStudent extends Student{
  public static String[] labCourse = {"CSE110", "CSE111", "CSE220", "CSE221"};

  public static int count;

  public CSEStudent(String n, int i){
    super(n, i);
    count++;
  }

  public void addLabBasedCourse(String course){

    for(int i=0; i<labCourse.length;i++){
      if(course.equals(labCourse[i])){
      this.courses+=course+" ";
      return;
      }
    }
    System.out.println("It is not a lab based course!"); 
  }

  public static void details(){
    System.out.println("Total CSE Students: "+count);
    System.out.println("Available Lab Based Courses:");
    for(String x:labCourse){
      System.out.print(x+" ");
    }
    System.out.println();
  }

}