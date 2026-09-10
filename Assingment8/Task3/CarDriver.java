package Task3;

public class CarDriver extends GenericDriver {

    static String[] restrictedAreas = new String[2];
    static int count;

    public CarDriver(String name){
        super(name);
    }

    public String toString(){
        return getName() + "'s driver profile is a Premium";
    }

    public String acceptRide(boolean hasVehicle){
        return super.acceptRide(hasVehicle) + "\n" +
               getName() + "'s driver profile is Premium";
    }

    public void hasSafetyTraining(){
        super.hasSafetyTraining();
        System.out.println("Premium drivers receive extra safety briefings.");
    }

    public static void restrictedAreas(String place){
        restrictedAreas[count++] = place;
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

            System.out.println(getName() +
                (found ? " cannot enter " : " can enter ") + area);
        }
    }
}
