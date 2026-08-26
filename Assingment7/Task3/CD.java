package Task3;

public class CD extends Product {
  public String band;
  public int minutes;
  public String genre;

  public CD(int id, String title, int price, String band, int minutes, String genre){
    super(id,title,price);
    
    this.band = band;
    this.minutes = minutes;
    this.genre = genre;
  }

  public String printDetail(){
    return getIdTitlePrice()+"\nBand: "+band+" Duration: "+minutes+"  minutes Genre: "+genre;
  }
}
