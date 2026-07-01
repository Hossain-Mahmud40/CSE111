import java.util.Scanner;

public class t1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {23, 100, 0, 56, -34};
    int n = arr.length;
   System.out.print("Remove Element = ");
   int x = sc.nextInt();
   int[] arr2 = new int[n];
   int count = 0;
   boolean found = false;
   for(int i=0;i<n;i++){
    if(arr[i]!=x){
      arr2[count] = arr[i];
      count++;
    }else{
      found = true;
    }
   }

   if(found){
    System.out.println("New array:");
    for(int i=0;i<count;i++){
      System.out.print(arr2[i]+" ");
    }
   }else{
    System.out.println("Element not found");
   
   }
   
  }
  
}
