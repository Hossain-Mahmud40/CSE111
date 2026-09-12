package Task5;

public class Manager extends Employee {

  public double bonus;
  public double bonusSalary;


  public Manager(String name, int baseSalary, int hoursWorked, int bonus){
    super(name, (double)baseSalary, hoursWorked);
    this.bonus = (double)bonus;
  }

  public void requestIncrement(int increment){
    double newSalary;
    if(getHoursWorked()>80 && getHoursWorked()<=100){
      newSalary=getBaseSalary()+increment/2;
      setBaseSalary(newSalary);
      System.out.println("$"+(increment/2)+" Increment approved.");
    }else if(getHoursWorked()>100){
      newSalary=getBaseSalary()+increment;
      setBaseSalary(newSalary);
      System.out.println("$"+increment+" Increment approved.");
    }else{
      System.out.println("Increment denied.");
    }
  }


  public void calculateSalary(){
        bonusSalary=getBaseSalary();
        if(getHoursWorked()>40)
            bonusSalary+=getBaseSalary()*bonus/100;
    }

  public void displayInfo(){
    super.displayInfo();
    System.out.println("Bonus: "+bonus+" %");
    System.out.println("Final Salary: $"+bonusSalary);
  }
}
