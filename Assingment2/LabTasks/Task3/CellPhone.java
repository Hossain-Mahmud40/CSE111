package Task3;

public class CellPhone {
    public String model = "unknwon";
    public String[] list = new String[3];
    int count=0;

    public void storeContact(String contact){
        if (count == 3){
            System.out.println("Memory full. New contact can't be stored.");
            return;
        }
        this.list[count++]=contact;
        System.out.println("Contact Stored");
    }

    public void printDetails(){
        System.out.println("Phone Model "+this.model);
        System.out.println("Contacts Stored "+this.count);
        if(this.count>0){
            System.out.println("Stored Contacts");
            for(int i=0; i<this.count; i++){
                System.out.println(this.list[i]);

            }
        }
    }
}
