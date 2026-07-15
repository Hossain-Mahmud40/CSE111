package Task2;

public class Cart {
  public int cartNumber;
  public String[] itemName = new String[3];
  public double[] itemPrice = new double[3];
  public double discount;
  public double totalPrice;
  public int count = 0;

   public void create_cart(int cartNumber){
    this.cartNumber = cartNumber;
  }
  public void addItem(String itemName, double itemPrice){
    if(count<3){
      this.itemName[count] = itemName;
      this.itemPrice[count] = itemPrice;
      this.totalPrice+=itemPrice;
      count++;
      System.out.println(itemName+" added to cart "+this.cartNumber+".");
      System.out.println("You have "+ count +" item(s) in your cart now.");
    }
    
    else{
      System.out.println("You already have 3 items on your cart");
    }
  }
  public void addItem(double itemPrice,String itemName){
    if(count<3){
      this.itemName[count] = itemName;
      this.itemPrice[count] = itemPrice;
      this.totalPrice+=itemPrice;
      count++;
      System.out.println(itemName+" added to cart "+this.cartNumber+".");
      System.out.println("You have "+ count +" item(s) in your cart now.");
    }
    
    else{
      System.out.println("You already have 3 items on your cart");
    }
  }

  public void cartDetails(){
    System.out.println("Your cart(c"+this.cartNumber+") : ");
    for (int i = 0; i < count; i++) {
      System.out.println(this.itemName[i] + " - " + this.itemPrice[i]);
    }
    System.out.printf("Discount Applied: %.1f%%\n",this.discount);
    System.out.println("Total price: "+this.totalPrice);
  }

  public void giveDiscount(double discount){
    this.discount = discount;
    this.totalPrice -= totalPrice*(discount/100);
  }
}
