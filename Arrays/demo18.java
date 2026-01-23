//Write a program to compute the prefix sum of an array without using any extra array. Time=O(n),Space=O(1).
 
package Arrays;

public class demo18 {
    public static void display(int arr[]){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
    }
    public static int[] prefixArray(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
             arr[i]=arr[i]+arr[i-1];
        }
         return arr;   
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println("O.G. array");
        display(arr);
        System.out.println("Prefix wthout using extra array");
        prefixArray(arr);
        display(arr);
    }    
}

//import java.util.*;

// public class demo18 {

//     public static void display(int arr[]){
//          for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//          }
//          System.out.println();
//     }
//     public static int[] prefixArray(int arr[]){
//         int n=arr.length;
//         int k=0;
//         int parr[]=new int[n];
//         parr[k++]=arr[0];
//         for(int i=1;i<n;i++){
//              parr[k++]=arr[i]+parr[i-1];
//         }
//          return parr;   
//     }
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40,50};
//         System.out.println("O.G. array");
//         display(arr);
//         System.out.println("Prefix array");
//         int brr[]=prefixArray(arr);
//         System.out.println(Arrays.toString(brr));
//     }    
// }
