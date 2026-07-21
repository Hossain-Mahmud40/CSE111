package ExtraTask.Task1;

public class Taxi {
  public String route;
  public String numberPlate;

  public Taxi(String numberPlate, String route){
    this.numberPlate = numberPlate;
    this.route = route;
  }

  public void compareTaxi(Taxi taxi){
    if(this.route.equals(taxi.route)){
      System.out.println("Both routes are the same!");
    }else{
      System.out.println("Routes are not the same!");
    }
  }
}
