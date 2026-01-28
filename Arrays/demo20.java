// //Given an integer array, check whether there exists an equilibrium point in the array.
// An equilibrium point is an index such that the sum of elements on the left side of the index is equal to the sum of elements on the right side of the index.
// If such a point exists, return true
// Otherwise, return false

package Arrays;

import java.util.*;

public class demo20 {
    public static int sumArray(int arr[]){
       int sum=0;
       for(int i=0;i<arr.length;i++){
          sum+=arr[i];
       }
        return sum;
    }

    public static boolean display(int arr[]){
        int sum=sumArray(arr);
        int prefixArray=0;
        for(int i=0;i<arr.length;i++){
            prefixArray+=arr[i];
            int suffixSum=sum-prefixArray;
            if(prefixArray==suffixSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={10,30,40,30,50};            //160                 
        System.out.println("O.G. array");
        System.out.println(Arrays.toString(arr));
        System.out.println(display(arr));
    }
}



////Return prefix and sufix array without using any etc array.

// public class demo20 {
//     public static void checker(int arr[]){
//         System.out.println("prefix sum:");
//         int prr[]=displayPrefixSum(arr.clone());
//         System.out.println(Arrays.toString(prr));
//         System.out.println("suffix sum:");
//         int srr[]=displaySufixSum(arr.clone());
//         System.out.println(Arrays.toString(srr));
//     }
//     public static int[] displaySufixSum(int arr[]){
//         int n=arr.length-2;
//         for(int i=n;i>=0;i--){
//             arr[i]=arr[i]+arr[i+1];
//         }
//         return arr;
//     }
//     public static int[] displayPrefixSum(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             arr[i]=arr[i]+arr[i-1];
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int arr[]={10,30,40,65,70};                  //[10, 40, 80, 145, 215]            215,205,175,135,70
//         System.out.println("O.G. array");
//         System.out.println(Arrays.toString(arr));
//         checker(arr);
//     }
// }
