package Task3;

public class Cargo {
  private String name;
  private int cap;

  public void setName(String nm){
    name = nm;
  }
  public String getName(){
    return name;
  }

  public void setCap(int c){
    cap = c;
  }
  public int getCap(){
    return cap;
  }

  public Cargo(String nm, int c){
    name = nm;
    cap = c;
  }

}
