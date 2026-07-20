package HomeTask.Task1;

public class Player {
  public String name;
  public int powerLevel;
  public String[] defeated = new String[5];
  public int count=0;

  public Player(String name, int powerLevel) {
    this.name = name;
    this.powerLevel = powerLevel;
    System.out.println(this.name+" joined the game");
    System.out.println("HP: "+this.powerLevel );
  }
    public Player(String name) {
    this.name = name;
    this.powerLevel = 100;
    System.out.println(this.name+" joined the game");
    System.out.println("HP: "+this.powerLevel );
  }

  public void viewInfo(){
    System.out.println("Player Name: "+this.name);
    System.out.println("Current HP: "+this.powerLevel );

    if (this.count>0) {
      System.out.println("Defeated:");
      for(int i = 0; i<count; i++){
      System.out.print(defeated[i]+", ");
    }
    System.out.println();
    }
    
  }

  public void defeatVillain(String name, int powerLevel){
    if(this.powerLevel < powerLevel){
      System.out.println("failed to defeat "+name);
    }else{
      this.powerLevel += powerLevel;
      System.out.println("defeated "+name);
      defeated[this.count++] = name;
    }
  }

  public void defeatVillain(char boost, String name, int powerLevel){
    int num = boost - '0';
    this.powerLevel*=num;
    System.out.println("HP with "+num+"x boost: "+this.powerLevel);
    if(this.powerLevel < powerLevel){
      System.out.println("failed to defeat "+name);
    }else{
      this.powerLevel += powerLevel;
      System.out.println("defeated "+name);
      defeated[this.count++] = name;
    }
  }

  public void defeatVillain(Player playerObject){
    if(this.powerLevel < playerObject.powerLevel){
      System.out.println("failed to defeat "+playerObject.name);
    }else{
      this.powerLevel += playerObject.powerLevel;
      System.out.println("defeated "+playerObject.name);
      defeated[this.count++] = playerObject.name;
    }

  }
}
