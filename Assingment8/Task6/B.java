package Task6;

public class B extends A {
public static int x = 0;
public int sum = 0;
public B() {
  sum = 0;
  y = temp + 3;
  super.sum = this.x + super.x + A.x;
  B.x -= 2;
}
public B(B b) {
  super(5);
  sum = b.sum + super.sum;
  x = b.x + 1;
  b.methodB(2, 3);
}
 public void methodA(int m, int n) {
  y = this.y + n + sum;
  x = x + 4 + n;
  sum = super.sum + x + y;
  System.out.println(x + " " + y + " " + sum);
}
public void methodB(int m, int n) {
  x = y + 2 + (++temp);
  sum = x + y + sum;
  System.out.println(x + " " + y + " " + sum);

  super.methodA(x, y);
 }
}
