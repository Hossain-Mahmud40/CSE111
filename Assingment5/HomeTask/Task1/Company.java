package Task1;

public class Company {
  public String cnm = "ABC Company";
  public Employee[] em = new Employee[3];
  public int count;

  public void addEmployee(Employee e){
  if (count>=3) {
    System.out.println("No more vacancy");
  }else{
    em[count++] = e;
    System.out.println(e.getName()+" has joined the company");
  }
  }

  public void details(){
    System.out.println("Company Name: "+cnm);
    System.out.println("Total Employee: "+count);
    System.out.println("Fulltime Employees:");
    for(int i =0; i<count; i++){
      if(em[i].getType().equals("Fulltime")){
        System.out.println("Name: "+em[i].getName()+", ID: "+em[i].getId());
      }
    }
    System.out.println("Part-Time Employees:");
    
    for(int i =0; i<count; i++){
      if(em[i].getType().equals("Part-time")){
        System.out.println("Name: "+em[i].getName()+", ID: "+em[i].getId());
      }
    }
  }

  public void removeEmployee(Employee e){
    for(int i =0; i<count; i++){
      if(em[i].getName().equals(e.getName())){
        // em[i] = null;
        System.out.println(e.getName() + " has left the company");
        for(int j=i; j<count-1;j++){
          em[j]=em[j+1];
        }
        em[count-1] = null;
        count--;
      }
    }

  }
}
