package Task1;

public class Butterfly extends Caterpillar {

  public Butterfly(String food, int age) {
    super(food, age);
  }

  public void transform(){
    energy-=5;
    System.out.println("Caterpillar transforms into Butterfly");    
  }
  public void eat(int amount){
    System.out.println("Butterfly lost energy while flying and absorbed nectar");
    energy += (amount*5);
  }
  public void showDetails() {
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy + " joules");
}

}
