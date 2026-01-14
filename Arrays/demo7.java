// Demonstration of sorting an array and finding smallest and largest elements(Basic approach)

package Arrays;

import java.util.*;

public class demo7 {

    public static int[] display(int arr[]){
       int n=arr.length;
       Arrays.sort(arr);
       System.out.println("Sorted array:");
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
       int brr[]={arr[0],arr[n-1]};
       return brr;
    }
    public static void main(String[] args) {
        int arr[]={30,50,10,40,20};
        int newarr[]=display(arr);
        System.out.println("Smallest element: "+newarr[0]);
        System.out.println("Largest element: "+newarr[newarr.length-1]);
    }
}
