package ExtraTask.Task3;

public class Cart {

  public String[] name = new String[10];
  public int[] price = new int[10];
  public int count;

  public Cart[] cartList = new Cart[3];
  public int cartCount;

  public void storeProduct(String name, int price) {
    if(this.count >= 10) {
      System.out.println("Limit Reached");
      return;
    }

    this.name[this.count] = name;
    this.price[this.count] = price;
    this.count++;
  }

  public void storeProduct(String name1, int price1,
                           String name2, int price2) {

    storeProduct(name1, price1);
    storeProduct(name2, price2);
  }

  public void info() {
    System.out.println("Cart Items:");

    if(this.count == 0) {
      System.out.println("The cart is empty.");
      return;
    }

    for(int i = 0; i < this.count; i++) {
      System.out.println(
        this.name[i] + " - " + this.price[i]
      );
    }
  }

  public void transferItem(Cart cart, String productName) {

    for(int i = 0; i < this.count; i++) {

      if(this.name[i].equals(productName)) {

        cart.storeProduct(
          this.name[i],
          this.price[i]
        );

        for(int j = i; j < this.count - 1; j++) {
          this.name[j] = this.name[j + 1];
          this.price[j] = this.price[j + 1];
        }

        this.name[this.count - 1] = null;
        this.price[this.count - 1] = 0;
        this.count--;

        System.out.println("Item transferred successfully.");
        return;
      }
    }
  }

  public void addCart(Cart c1, Cart c2, Cart c3) {
    this.cartList[this.cartCount++] = c1;
    this.cartList[this.cartCount++] = c2;
    this.cartList[this.cartCount++] = c3;
  }

  public void allCartInfo() {
    for(int i = 0; i < this.cartCount; i++) {
      this.cartList[i].info();
    }
  }
}