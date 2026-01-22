//find the sorted squares of a sorted array using the two-pointer technique without using built-in sorting methods.

package Arrays;

import java.util.*;

public class demo17 {

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int arr[]){
         int j=arr.length-1;
         int i=0;
         while(j>i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
         }
    }

    public static int[] square(int arr[]){
       int i=0;
       int j=arr.length-1;
       int narr[]=new int[arr.length];
       int k=0;
       while(j>=i){
        if(Math.abs(arr[j])<Math.abs(arr[i])){
           narr[k++]=arr[i]*arr[i];
           i++;
        }else{
            narr[k++]=arr[j]*arr[j];
            j--;
        }
       }
       return narr;
    }
    public static void main(String[] args) {
        int arr[]={-10,-5,-2,2,4,5};
        System.out.println("O.G. array");
        display(arr);
        System.out.println("new arr");
        int brr[]=square(arr);
        reverse(brr);
        System.out.println(Arrays.toString(brr));
    }
}
