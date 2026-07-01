package Task3;

import java.util.Scanner;

public class t3 {
  public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.print("N=");
    int n = sc.nextInt();    
    int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element "+i+":");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

          boolean printed = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    printed = true;
                    break;
                }
            }
          if (printed == false) {
          int count = 0;         
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
                System.out.println(arr[i] + " - " + count + " times");
            }
        }
        
  }
}

