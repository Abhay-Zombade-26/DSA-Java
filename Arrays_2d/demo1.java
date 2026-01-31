//multiplication of 2 matrix.

package Arrays_2d;

import java.util.*;

class demo1 {
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] mulArray(int arr1[][],int arr2[][],int r1,int c1,int r2,int c2){
        int sum=0;
        if(c1!=r2){
            System.out.println("pls enter the same i/p in both array");
            return new int[0][0];
        }
        int narr[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                  for(int k=0;k<c1;k++){
                   narr[i][j]+=(arr1[i][k]*arr2[k][j]);            
                }
          }
        }
        return narr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for r1 and c1:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        System.out.println("enter value for r2 and c2:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        System.out.println("enter array1 i/p:");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
             }
        }
        System.out.println("enter array2 i/p:");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array1");
        display(arr1);
        System.out.println("Array2");
        display(arr2);
        System.out.println("Multiplication array:");
       int brr[][]=mulArray(arr1,arr2,r1,c1,r2,c2);
       display(brr);
    }
}




//addition of 2 matrix.

// import java.util.*;

// class demo1 {
//     public static void display(int arr[][]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static int[][] sumArray(int arr1[][],int arr2[][],int r1,int c1,int r2,int c2){
//         if(r1!=r2 || c1!=c2){
//             System.out.println("pls enter the same i/p in both array");
//             return new int[0][0];
//         }
//         int narr[][]=new int[r1][c1];
//         for(int i=0;i<r1;i++){
//             for(int j=0;j<c1;j++){
//                 narr[i][j]=arr1[i][j]+arr2[i][j];
//             }
//         }
//         return narr;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter value for r1 and c1:");
//         int r1=sc.nextInt();
//         int c1=sc.nextInt();
//         int arr1[][]=new int[r1][c1];
//         System.out.println("enter value for r2 and c2:");
//         int r2=sc.nextInt();
//         int c2=sc.nextInt();
//         int arr2[][]=new int[r2][c2];
//         System.out.println("enter array1 i/p:");
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr1[i].length;j++){
//                 arr1[i][j]=sc.nextInt();
//              }
//         }
//         System.out.println("enter array2 i/p:");
//         for(int i=0;i<arr2.length;i++){
//             for(int j=0;j<arr2[i].length;j++){
//                 arr2[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("Array1");
//         display(arr1);
//         System.out.println("Array2");
//         display(arr2);
//         System.out.println("Sum array:");
//        int brr[][]=sumArray(arr1,arr2,r1,c1,r2,c2);
//        display(brr);
//     }
// }



//taking 2d array as i/p and display them.

// import java.util.*;

// public class demo1 {
//     public static void display(int arr[][]) {
//         System.out.println("2d array is");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int arr[][]=new int[2][3];
//         System.out.println("enter the 2d array i/p:");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                arr[i][j]=sc.nextInt();
//             }
//         }
//         display(arr);
//     }
// }
