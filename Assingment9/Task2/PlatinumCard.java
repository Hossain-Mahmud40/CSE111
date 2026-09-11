package Task2;

public class PlatinumCard extends CreditCard{
  
  public PlatinumCard(String name, String acn){
    super(name,acn,100);
  }
  public void spendCash(int p){
    System.out.println("Previous Reward Points: "+rewardPoints);
    rewardPoints+= (p/100)*2;
    System.out.println("Reward points after spending "+p+" taka: "+rewardPoints);
  }
}
