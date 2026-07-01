import java.util.*;
public class t2 {
  public static void main(String[]args){
    int[] arr = {7,13,2,10,6};
    int n = arr.length;
    int sp = 0, lp = 0, largest = arr[0], smallest = arr[0]; 
    for(int i=1;i<n;i++){
      if(arr[i]>largest){
        largest = arr[i];
        lp = i;
      }
      if(arr[i]<smallest){
        smallest = arr[i];
        sp = i;
      }
    }
    System.out.println(largest + " " + lp + " " + smallest + " " + sp);
  }
}
