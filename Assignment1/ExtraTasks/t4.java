import java.util.*;
public class t4 {
  public static void main(String[]args){
  int[] arr = {5,4,3,2,1};
  int n = arr.length;
  
  int j=n-1;
  for(int i=0;i<n/2;i++){
   int temp = arr[i];
   arr[i]=arr[j];
   arr[j]=temp;
   j--;
  }
  System.out.println(Arrays.toString(arr));

  }
}
