package Task4;

public class Car extends Vehicle {
  public  int seats;
  public  static Car[] car = new Car[10];
  public static int count;
  public Car(String model, int price, int seats){
    super(model, price);
    car[count++]=this;
    vehicleId ="CAR00"+count;
    this.seats = seats;
    System.out.println("Vehicle ID: "+vehicleId+" created");
  }
  public void vehicleDetail(){
  super.vehicleDetail();
  System.out.println("Type: Regular Car");
  System.out.println("Seats: "+seats);
}
public static void markAsSold(Car c){
  c.sold = true;
}

static void showAllAvailableCars(){
  System.out.println("Total Car: "+count);
  System.out.println("Available Cars:");
  for(int i=0;i<count;i++){
    if(!car[i].sold){
      System.out.println(car[i].vehicleId+" : "+car[i].model);
    }
    
  }
}
static void showAllCars(){
  System.out.println("Total Car: "+count);
  for(int i=0;i<count;i++){
    System.out.println(car[i].vehicleId+" : "+car[i].model+" - "+(car[i].sold?"sold":"available"));
  }
}

}


