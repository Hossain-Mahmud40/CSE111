package Task4;

public class UberEatsUser {
  private String nm;
  private String lc = "Unknown";
  
    public void setNm(String n){
      nm = n;
    }
    public String getNm(){
      return nm;
    }

    public void setLc(String l){
      lc = l;
    }
    public String getLc(){
      return lc;
    }

    public UberEatsUser(String n, String l){
      nm = n;
      lc = l; 
    }

    public UberEatsUser(String n){
      nm = n;
    }

     public void updateLocation(String l){

      if(lc.equals("Unknown")){
      lc = l;
      System.out.println("Update Successful!");
      return;
      }
      System.out.println("We already have your location. Please place an order!");
      


  }
}
