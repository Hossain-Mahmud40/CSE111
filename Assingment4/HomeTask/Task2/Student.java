package Task2;

public class Student {

  public int id;
  public String[] courseName = new String[4];
  public int count;
  public double cgpa;
  public boolean cgDefined;

  public Student(int id){
    this.id = id;
    System.out.println("A student with ID " + this.id + " has been created.");
  }
  public Student(int id, double cgpa){
    this.id = id;
    this.cgpa = cgpa;
     this.cgDefined = true;
    System.out.println("A student with ID "+this.id+" and cgpa "+this.cgpa+" has been created.");
  }

  public void addCourse(String courseName){
    if(!cgDefined){
      System.out.println("Failed to add "+courseName);
      System.out.println("Set CG first");
    }
    else if (this.cgpa<3 && count==3){
      System.out.println("Failed to add "+courseName);
      System.out.println("CG is low. Can't add more than 3 courses.");
    }
    else if(this.count==4){
      System.out.println("Failed to add "+courseName);
      System.out.println("Maximum 4 courses allowed.");
    }
    else{
      this.courseName[count++] = courseName;
    }
  }

  public void addCourse(String[] newCourses){
    for(int i =0; i<newCourses.length;i++){
      addCourse(newCourses[i]);
    }
  }

  public void storeCG(double cgpa){
    this.cgpa = cgpa;
    this.cgDefined = true;
  }

  public void showAdvisee(){
    System.out.println("Student ID: "+this.id+", CGPA: "+this.cgpa);
    if (count == 0) {
      System.out.println("No courses added.");      
    }else{
      System.out.println("Added courses are:");
      for(int i=0; i<count;i++){
        System.out.print(courseName[i]+" ");
      }
      System.out.println();
    }
  }

  public void removeAllCourse(){
    courseName = new String[4];
    count = 0;
  }

  public void storeID(int id){
    this.id = id;
  }
}
