package Task3;

public class BikeDriver extends GenericDriver {
  public String isPremium;
  static  String[] restrictedAreas = new String[3];
  static int count;
  
  public BikeDriver(String name, String isPremium){
    super(name);
    this.isPremium = isPremium; 
  }
  public String toString(){
   return getName() + "'s driver profile is " + (isPremium.equals("Not Premium") ? "Not Premium" : "Premium");
  }

  public String acceptRide(boolean hasVehicle){    
    return super.acceptRide(hasVehicle) + "\n" + toString();
  }
  public void hasSafetyTraining(){
    super.hasSafetyTraining();
    if(!isPremium.equals("Not Premium")){
      System.out.println("Premium drivers receive extra safety briefings.");
    }
  }

  public static  void restrictedAreas(String placeName){
    restrictedAreas[count++] = placeName;
  }
  public String[] restrictedAreas(){
    return restrictedAreas;
  }

  public void fightRestriction(String[] areas){
    for(String area : areas){
        boolean found = false;
        for(int i=0; i<count; i++){
            if(restrictedAreas[i].equals(area)){
                found = true;
                break;
            }
        }

        System.out.println(getName() +(found ? " cannot enter " : " can enter ") + area);
    }
}
}
