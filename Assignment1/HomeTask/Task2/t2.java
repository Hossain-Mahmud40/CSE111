package Task2;

import java.util.Scanner;
public class t2 {
  public static void main(String[]args){

      Scanner sc = new Scanner(System.in);
      System.out.print("Write the String: ");
      String str = sc.next();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == 'a') {
                System.out.print('z');
            }
            else {
                System.out.print((char)(ch - 1));
            }
        }
  }
  
}
