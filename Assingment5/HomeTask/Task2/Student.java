package Task2;

public class Student {
  private int id;
  public String name;
  public double cg;

  public int getId(){
    return id;
  }
  public void setId(int d){
    id = d;
  }

  public Student(String nm, int d, double c){
    name = nm;
    id = d;
    cg = c;
  }

}
