//bubble sort optimized solution.  O(n) suppose we got the array fully in sorted order.

package Sorting_algo;

import java.util.*;

public class demo1 {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void bubble(int arr[]){
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            boolean flage=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                 k=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=k;
                 flage=true;
                }
            }
            if(!flage){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        System.out.println("O.G. array");
        display(arr);
        System.out.println("sorted array");
        bubble(arr);
        display(arr);
    }
}


//bubble sort . time complexity = O(n^2)

// package Sorting_algo;

// import java.util.*;

// public class demo1 {
//     public static void display(int arr[]){
//         System.out.println("O.G. array");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
    
//     public static int[] bubble(int arr[]){
//         int k=0;
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                  k=arr[j];
//                  arr[j]=arr[j+1];
//                  arr[j+1]=k;
//                 }
//             }
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int arr[]={5,7,4,3,1};
//         display(arr);
//         System.out.println("sorted array");
//         int brr[]=bubble(arr);
//         System.out.println(Arrays.toString(brr));
//     }
// }
