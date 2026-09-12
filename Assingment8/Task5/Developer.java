package Task5;

public class Developer extends Employee {


  public double bonusSalary;
  public String lang;

  public Developer(String name, int baseSalary, int hoursWorked, String lang){
    super(name, (double)baseSalary, hoursWorked); 
    this.lang = lang;
    bonusSalary=baseSalary;
  }

  public void calculateSalary(){
    bonusSalary=getBaseSalary();

    if(lang.equals("Java")){
        bonusSalary+=700;
    }
}

  public void displayInfo(){
    super.displayInfo();
    System.out.println("Language: "+lang);
    System.out.println("Final Salary: $"+bonusSalary);
  }
  
}
