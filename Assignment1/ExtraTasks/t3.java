import java.util.*;
public class t3 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);   
  System.out.print("Enter the size of the array: ");
  int n = sc.nextInt();
  int[] arr = new int[n];
  for(int i=0;i<n;i++){
    System.out.print("Enter element "+(i+1)+": ");
    arr[i] = sc.nextInt();
  }
  for(int i=0;i<n-1;i++){
    for(int j=0;j<n-1-i;j++){
     if(arr[j]>arr[j+1]){
      int temp = arr[j+1];
      arr[j+1] = arr[j];
      arr[j]=temp;
     }
    }
  }
  System.out.println(Arrays.toString(arr));
  if(n%2!=0){
     System.out.println(arr[(n/2)]);
  }
  if(n%2==0){
    double  med = (arr[(n/2)-1]+arr[(n/2)])/2.0;
    System.out.println(med);
  }
}
}