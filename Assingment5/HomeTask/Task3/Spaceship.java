package Task3;

public class Spaceship {
  public String name;
  public int cap;
  public Cargo[] cargo = new Cargo[100];
  public int count;
  public int tw;

  public Spaceship(String nm, int c){
    name = nm;
    cap = c;
  }

  public void loadCargo(Cargo c){
    int w = tw+c.getCap();
    if(count >= cargo.length){
    return;
    }
    if(w>cap){
      System.out.println("Warning: Unable to load "+c.getName()+" inside "+name+". Exceeds capacity by "+(w-cap)+".");
      return;
    }
    cargo[count++] = c;
    tw+=c.getCap();
  }

  public void displayDetails(){
    System.out.println("Spaceship Name: "+name);
    System.out.println("Capacity: "+cap);
    System.out.println("Current Cargo Weight: "+tw);
    System.out.print("Cargo:");
    for(int i=0;i<count;i++){
      System.out.print(cargo[i].getName()+" ");
    }
    System.out.println();
  }
}
