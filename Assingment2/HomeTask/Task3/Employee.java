package Task3;

public class Employee {
  public String EmployeeName;
  public double Salary = 30000.0;
  public String Designation = "junior";
  
  public void newEmployee (String name){
    this.EmployeeName = name;
  }
  public void displayInfo(){
    System.out.println("Employee Name: "+this.EmployeeName);
    System.out.printf("Employee Salary: %.1f Tk\n", this.Salary);
    System.out.println("Employee Designation: "+this.Designation); 
  }
  public void calculateTax(){
    if(Salary<=30000.0){
      System.out.println("No need to pay tax");
      return;
    }
    else if(Salary>30000.0 && Salary<=50000.0){
      double tax = this.Salary*0.1;
      System.out.printf("%s Tax Amount: %.1f Tk\n",EmployeeName,tax);
      return;
    }else{
      double tax = this.Salary*0.3;
      System.out.printf("%s Tax Amount: %.1f Tk\n",EmployeeName,tax);
    }
  }
  public void promoteEmployee(String Designation){
    this.Designation = Designation;

    if(Designation.equals("senior")){
      this.Salary+=25000.0;
    }
    else if(Designation.equals("lead")){
      this.Salary+=50000.0;
    }
    else if(Designation.equals("manager")){
      this.Salary+=75000.0;
    }
    System.out.println(this.EmployeeName+" has been promoted to "+Designation);
    System.out.printf("New Salary: %.2f Tk\n",this.Salary);
  }
  
}
