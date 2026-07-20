package Task3;

public class TravelPrep {
  public int budget = 1250;
  public String t_name = "Unknown";
  public String dname;
  public int dprice = 300;
  public String[] destination = new String[3];
  public int[] price = new int[3];
  public int count;
  public int totalCost;
  public TravelPrep(){
    System.out.println(this.t_name+" package would cost at most "+this.budget+" yen");
  }

  public TravelPrep(String t_name, int budget){
    this.budget = budget;
    this.t_name = t_name;
    System.out.println(this.t_name+" package would cost at most "+this.budget+" yen");
  }

  public TravelPrep(String dname1, String dname2){
    this.dname = dname2+" "+dname1;
    System.out.println(this.dname+" costs "+this.dprice+" yen");
  }

   public TravelPrep(String dname1, String dname2,int price){ 
    this.dprice = price; 
    this.dname = dname2+" "+dname1;
    System.out.println(this.dname+" costs "+price+" yen");
  }

  public void add_to_itinerary(TravelPrep dobj){ 
    if(this.count >= 3){
      return;
    }
    if(this.totalCost + dobj.dprice >this.budget) {
      System.out.println("Budget going overboard");
      return;
    }
    this.destination[this.count] = dobj.dname;
    this.price[this.count++] = dobj.dprice;
    this.totalCost += dobj.dprice; 
  }

  public void add_to_itinerary(TravelPrep dobj1, TravelPrep dobj2){
    add_to_itinerary(dobj1);
    add_to_itinerary(dobj2);
  }

  public void show_itinerary(){
    System.out.println("Itinerary for "+this.t_name);
    for(int i=0;i<this.count;i++){
      System.out.println((i+1)+". "+this.destination[i]+" - "+this.price[i]+" yen");
    }
    System.out.println( "Total cost of " + this.count +" destinations: " + this.totalCost + " yen");
  }

 public String updateCost(int price){
  this.dprice+=price;
  return "Cost of "+this.dname+" updated to "+this.dprice;
 }
}


