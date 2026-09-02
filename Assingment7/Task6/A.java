package Task6;

public class A{
 public int m = 14, n = -1, p = 3;
 public static int temp = 11;
 public void methodA(int m, int n){
 int x = 0;
 p = this.p + m + (this.temp++);
 x = x + 2 + n;
 this.n = n + B.x + p;
 System.out.println(this.m + " " + p+ " " + this.n);
 }
 }