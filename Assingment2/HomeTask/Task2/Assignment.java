package Task2;

public class Assignment {
  public int tasks;
  public String difficulty;
  public boolean submission;
  public void printDetails(){
    System.out.println("Number of tasks: "+this.tasks);
    System.out.println("Difficulty level: "+this.difficulty);
    System.out.println("Submission required: "+this.submission);
  }
  public String makeOptional(){
    if(this.submission){
      this.submission  = false;
      return "Assignment will not require submission";
    } else{ 
      return "Submission is already not required";
    }
  }
}
