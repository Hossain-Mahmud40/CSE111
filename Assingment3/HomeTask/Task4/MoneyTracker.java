package Task4;

public class MoneyTracker {
  
  public String name;
  public double balance;
  public double lastAdded, lastSpent;
  public MoneyTracker(){
    System.out.println("A new money tracker has been launched.");
  }

  public String info(){
    return "Name: "+this.name+"\nCurrent Balance: "+this.balance;
  } 

  public void createTracker(String name){
    this.name = name;
    this.balance = 1.0;
  }

  public void income(int amount){
    this.lastAdded = amount;
    this.balance+=amount;
    System.out.println("Balance Updated!");
  }

  public void expense(int amount){
    if(amount<=this.balance){
      this.lastSpent = amount;
      this.balance-=amount;
    if(this.balance == 0.0){
    System.out.println("You're broke!");
    }else{
    System.out.println("Balance Updated!");
    } 
    }else{
      System.out.println("Not enough balance.");
    }
  }
  public void showHistory(){
    System.out.println("Last added: "+this.lastAdded);
    System.out.println("Last spent: "+this.lastSpent);
  }
}
