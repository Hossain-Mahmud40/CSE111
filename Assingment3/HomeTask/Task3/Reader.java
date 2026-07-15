package Task3;

public class Reader {
  public String name = "New user";
  public int capacity = 2;
  public String[] books;
  public int count;

  public Reader(String name){
    this.name = name;
    this.books = new String[this.capacity];
    System.out.println("A new reader is created!");
  }
  public Reader(String name,int capacity){
    this.name = name;
    this.capacity = capacity;
    this.books = new String[this.capacity];
    System.out.println("A new reader is created!");
  }

  public void readerInfo(){
    System.out.println("Name: "+this.name);
    System.out.println("Capacity: "+this.capacity);
    System.out.println("Books: ");
    if (count>0) {
      for(int i =0;i<count;i++){
        System.out.println("Book " + (i + 1) + ": " + this.books[i]);
      }
    }else{
      System.out.println("No books added yet");
    }
  }
  public void updateCapacity(int capacity){
    this.capacity = capacity;
    String[] temp = new String[this.capacity];

    for(int i = 0; i < count; i++){
        temp[i] = this.books[i];
    }
    this.books = temp;
    System.out.println("Capacity has changed to " + this.capacity);
  }

  public void addBook(String book){
    if (count<capacity) {
      this.books[count++] = book;
    }else{
      System.out.println("No more capacity");
    }
  }
}
