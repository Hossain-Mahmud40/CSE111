package Task4;

public class Restaurant {
  public String rn;
  public String rlc;
  public UberEatsUser[] ue = new UberEatsUser[3];
  public int c;
  public Restaurant(String r, String l){
    rn = r;
    rlc = l;
  }

  public void takeOrder(UberEatsUser u){
     if(u.getLc().equals("Unknown")){
      System.out.println("Location : "+u.getLc()+". Please update your location information!");
      return;
     }
     for(int i=0;i<c;i++){
      if(ue[i]==u){
        System.out.println("You already have a pending order!");
        return;
      }
     }
     if(c>=3){
      System.out.println("We are really busy right now. Please order after some time. Thank you!");
      return;
     }
     System.out.println("Your order has been added!");
     ue[c++] = u;
  }

  public void completeOrders(){

    if(c==0){
      System.out.println("No pending orders at the moment.");
      return;
    }

    System.out.println("Showing "+rn+" orders:");
    for(int i =0; i<c; i++){
      System.out.println("Order by "+ue[i].getNm()+" at "+ue[i].getLc()+" completed");
    }

    ue = new UberEatsUser[3];
    c = 0;
  }

 

}
