package Task4;

public class Connect {

  public Student[] stdObj = new Student[5];
  public int totalAdvisee;
  
  public Connect(){
    System.out.println("Connect is ready to use!");
  }

  public void login(Student std){
    if(std.email == null || std.password == null){
      System.out.println("Email and password need to be set.");
      return;
    }
    System.out.println("Login successful");
    std.isLoggedIn = true;
  }

  public void advising(Student std){
    if(!std.isLoggedIn){
      System.out.println("Please login to advise courses!");
      return;
    }
    System.out.println("You haven't selected any courses.");
  }

  public void advising(Student std, String course1,String course2,String course3,String course4){
    if(!std.isLoggedIn){
      System.out.println("Please login to advise courses!");
      return;
    }
    System.out.println("You need special approval to take more than 3 courses.");
  }

  public void advising(Student std, String course1,String course2,String course3){
    if(!std.isLoggedIn){
      System.out.println("Please login to advise courses!");
      return;
    }
    if(this.totalAdvisee >= 5){
    return;
    }
    std.courses[std.count++] = course1;
    std.courses[std.count++] = course2;
    std.courses[std.count++] = course3;
    System.out.println("Advising successful!");
    this.stdObj[this.totalAdvisee++]=std;
  }

  public void allAdviseeInfo(){
    System.out.println("Total Advisee: "+this.totalAdvisee);
    for(int i=0; i<totalAdvisee;i++){
    System.out.println("Name: "+this.stdObj[i].name+" ID: "+this.stdObj[i].id);
    System.out.println("Department: "+this.stdObj[i].department);
    System.out.println("Advised Courses:");
    for(int j=0; j<this.stdObj[i].count;j++){
      System.out.print(this.stdObj[i].courses[j]+" ");
    }
    System.out.println();
    System.out.println("==============");
    }
    
    
    
  }
}
