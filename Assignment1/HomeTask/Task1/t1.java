package Task1;

import java.util.*;
public class t1 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        
        System.out.print("First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Second Number: ");
        int num2 = sc.nextInt();
        int count = 0;

        for (int i = num1; i <= num2; i++) {

            if (i < 2) 
                {
                    continue;
                }    

            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                count++;
            }
        }

        System.out.println("There are " + count + " prime numbers between " + num1 + " and " + num2 + ".");
}
  
}
