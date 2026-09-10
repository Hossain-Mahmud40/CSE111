package Task2;

public class Concert {
  public String venue;
  public String time;
  public  String[] artists = new String[5];
  public  int count;
  public int ticketSold;
  public static int totalTicketsSold;
  
  public Concert(String venue, String time){
    this.venue = venue;
    this.time = time;
  }

  public void addArtist(String name){
    artists[count++]=name;
  }

  public void showDetails(){
    System.out.println("Venue: "+ venue);
    System.out.println("Showtime: "+time);
    System.out.println("Artist:");
    for(int i=0;i<count;i++){
      System.out.println("-"+artists[i]);
    }
    System.out.println("Tickets sold in this concert: "+ticketSold);
  }

  public void buyTicket(String zone, int quantity){
    int price = zone.equals("A") ? 500 : 1000;
    ticketSold+=quantity;
    totalTicketsSold+=quantity;
    System.out.println("Total price: "+price*quantity);
  }
  public void buyTicket(String zone){
    buyTicket(zone, 1);
  }
  public static void showTotalTicketsSold(){
    System.out.println("Total tickets sold (all venues): "+totalTicketsSold);
  }
}
