package Task4;

public class MobilePhone {

  public int ContactCapacity;
  public int contactCount = 0;
  public String[] name;
  public int[] number;

  public void setContactCapacity(int ContactCapacity){
    this.ContactCapacity = ContactCapacity;
    this.name = new String[ContactCapacity];
    this.number = new int[ContactCapacity];
  }
  
  public void details(){
    System.out.println("Total Contacts: "+this.contactCount);
    System.out.println("Contact List:");
    for(int i=0;i<this.contactCount;i++){
      System.out.println(this.name[i]+":"+this.number[i]);
    }
  }

  public void makeCall(int number){
    for(int i=0;i<contactCount;i++){
      if(this.number[i] == number){
        System.out.println("Calling " + this.name[i] + " . . .");
        return;
      }
    }
    System.out.println("Calling " +number+ " . . .");
  }

  public void addContact(String name, int number){ 
    if (contactCount>=this.ContactCapacity) {
      System.out.println("Storage Full!!"); 
      return;     
    }
    this.name[contactCount] = name;
    this.number[contactCount] = number;
    System.out.println("The contact of "+name+" is added.");
    contactCount++;
  }
  
}
