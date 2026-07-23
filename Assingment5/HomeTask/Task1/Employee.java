package Task1;

public class Employee {
  private String name;
  private int id;
  private String type;

  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public String getType(){
    return type;
  }

  public Employee() {
    System.out.println("A default employee has been created");
  }

  public Employee(String nm, int idd, String tp){
    name = nm;
    id = idd;
    type = tp;
  }
}
