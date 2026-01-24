//Give the Optimized range sum queries using prefix sum technique


package Arrays;

import java.util.*;

public class demo19 {
    public static int sumArray(int prefixSumArr[],int l,int r){
        if(l>1){
        return prefixSumArr[r-1]-prefixSumArr[l-2];
        }else{
        return prefixSumArr[r-1];
        }
    }
    public static int[] display(int arr[]){
         for(int i=1;i<arr.length;i++){
              arr[i]=arr[i]+arr[i-1];
         }
         return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,3,6,5};
        Scanner sc=new Scanner(System.in);
         int prefixSumArr[]=display(arr);
        System.out.println("Enter Q times query to find the sum or array:");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.println("enter the value of l:");
            int l=sc.nextInt();
            System.out.println("enter the value of r:");
            int r=sc.nextInt();
            System.out.print("sum of l to r range is:");
            System.out.println(sumArray(prefixSumArr,l,r));
    }
  }
}

//find the sum of elements in a given array for q queries using a brute-force approach. 
// For each query, you are given a left (l) and right (r) index, where the array uses 1-based indexing.


// public class demo19 {

//     public static int display(int arr[],int l,int r){
//         int sum=0;
//           for(int i=l-1;i<=r-1;i++){
//             sum+=arr[i];
//           }
//          return sum;
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,1,3,6,5};
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Q times query to find the sum or array:");
//         int q=sc.nextInt();
//         for(int i=0;i<q;i++){
//             System.out.println("enter the value of l:");
//             int l=sc.nextInt();
//             System.out.println("enter the value of r:");
//             int r=sc.nextInt();
//             System.out.print("sum is:");
//             System.out.println(display(arr,l,r));
//         }
//     }
// }
