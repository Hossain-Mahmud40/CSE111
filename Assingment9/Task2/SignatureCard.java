package Task2;

public class SignatureCard extends CreditCard{
  
  public SignatureCard(String name, String acn){
    super(name,acn,200);
  }
  public void spendCash(int p){
    System.out.println("Previous Reward Points: "+rewardPoints);
    rewardPoints+= (p/100)*4;
    System.out.println("Reward points after spending "+p+" taka: "+rewardPoints);
  }
  
  public void cardDetails(){
    super.cardDetails();
    System.out.println("Possible Number of Companions for Lounge: 5");

  }
}

