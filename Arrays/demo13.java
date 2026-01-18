//approach to a right Rotate an array by k times.

package Arrays;

import java.util.*;

public class demo13 {
     public static void rotate(int arr[],int n,int k){
          k = k % n;
          int nar[]=new int[n];
          int p=0;
          for(int i=n-k;i<=n-1;i++){
              nar[p++]=arr[i];
          }
          for(int i=0;i<=n-k-1;i++){
              nar[p++]=arr[i];
          }
         
         for(int i=0;i<n;i++){
              System.out.print(nar[i]+" ");
          }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k value");
        int k=sc.nextInt();
        System.out.println("O.G array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Rotated array");
          rotate(arr,n,k);
    }
}

//approach to a left rotation by k positions.

// import java.util.*;

// class demo13 {
//     public static void display(int arr[]){
//          for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static int[] rotate(int arr[],int k,int n){
//         k=k%n;
//         int narr[]=new int[5];
//         int j=0;
//         for(int i=k;i<=n-1;i++){
//             narr[j++]=arr[i];
//         }
//          for(int i=0;i<=k-1;i++){
//             narr[j++]=arr[i];
//         }
//         return narr;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int arr[]={10,20,30,40,50};
//         int n=arr.length;
//         System.out.println("enter kth rotations:");
//         int k=sc.nextInt();
//         System.out.println("O.G array");
//         display(arr);
//         System.out.println();
//         System.out.println("Rotated array");
//         int brr[]=rotate(arr,k,n);
//         display(brr);
//     }
// }