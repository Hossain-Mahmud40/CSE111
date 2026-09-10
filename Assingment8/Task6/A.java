package Task6;

public class A {
public static int temp = 4;
public static int x = -10;
public int sum, y;
public A() {
  y = temp - 2;
  sum = temp + 1 + this.x;
  temp -= 2;
}
public A(int x){
   this.methodA(3,5);
}
public void methodA(int m, int n) {
  y = y + m + (temp++);
  x = x + 1 + n;
  sum = sum + this.x + y;
  System.out.println(x + " " + y + " " + sum);
 }
}


