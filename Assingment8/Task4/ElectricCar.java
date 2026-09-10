package Task4;

public class ElectricCar extends Vehicle {
  public int capacity;
  public static int count;

  public  ElectricCar(String model, int price, int capacity){
    super(model, price);
    count++;
    vehicleId ="EV00"+count;
    this.capacity = capacity;
    System.out.println("Vehicle ID: "+vehicleId+" created");
  }

  public void vehicleDetail(){
  super.vehicleDetail();
  System.out.println("Type: Electric Vehicle");
  System.out.println("Battery Capacity: "+capacity+" kWh");
}
  public static void markAsSoldEV(ElectricCar e){
  e.sold = true;
}
}
