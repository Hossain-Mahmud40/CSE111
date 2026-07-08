package Assingment.LabTasks.Task1;

public class t1 {
    public static void main(String[]args){
        Cat c1 = new Cat(); 
        System.out.println("1===================");
        c1.printCat();
        c1.color = "Black"; 
        System.out.println("2===================");
        c1.printCat(); 
        c1.color = "Brown"; 
        c1.action = "jumping"; 
        System.out.println("3===================");
        c1.printCat(); 

    }
}
