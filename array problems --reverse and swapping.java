import java.util.*;
import java.lang.*;
public class MyClass {
    public static void main(String args[]) {
      int[] arr={1,2,3,4,5,6};
      for(int i=0;i<arr.length/2;i++){                   //swapping the array elements
          for(int j=arr.length-1-i;j>=arr.length-1-i;j--){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
          }
        (or)
        int i=0;
        int j=arr.length-1;
        while(i<j){
        int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        
        
        }
        System.out.println(Array.toString(arr));
    
    
    
     int[] newArray=new int[arr.length];     //reversing the array to new array
          int j=0;
          for(int i=arr.length-1;i>=0;i--){
              
              newArray[j]=arr[i];
              j++;
          }
      
      System.out.println(Arrays.toString(newArray));
    }
    }
