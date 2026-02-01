//Accept the r*c square matrix and print that matrix transpose without using extra space.
//Time complexity: O(n²)  space complexity:O(1)

package Arrays_2d;

import java.util.*;

public class demo2{

    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void swapArray(int arr[][],int r1,int c1){
          for(int i=0;i<r1;i++){
            for(int j=i+1;j<c1;j++){            
                //without temp                                      // with temp variable         
               arr[i][j]=arr[i][j]+arr[j][i];                      // int temp=arr[i][j];
               arr[j][i]=arr[i][j]-arr[j][i];                     // arr[i][j]=arr[j][i];
               arr[i][j]=arr[i][j]-arr[j][i];                    // arr[j][i]=temp;
            }
        }
        display(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for r1 and c1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr[][]=new int[r1][c1];
        System.out.println("enter the 2d array element");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("O.G 2d array");
        display(arr);
        System.out.println("Transpose matrix");
        swapArray(arr, r1, c1);
    }
}



//Accept the r*c square matrix and print that matrix transpose using extra space.

// import java.util.*;

// public class demo2 {
//     public static void display(int arr[][]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void transpose(int arr1[][],int r1,int c1){
//         int narr[][]=new int[c1][r1];
//           for(int i=0;i<c1;i++){
//             for(int j=0;j<r1;j++){
//                 narr[i][j]=arr1[j][i];
//             }
//         }
//         display(narr);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter value for r1 and c1:");
//         int r1=sc.nextInt();
//         int c1=sc.nextInt();
//         int arr1[][]=new int[r1][c1];
       
//         System.out.println("enter array1 i/p:");
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr1[i].length;j++){
//                 arr1[i][j]=sc.nextInt();
//              }
//         }
        
//         System.out.println("O.G 2d array");
//         display(arr1);
//         System.out.println("Transpose matrix");
//         transpose(arr1, r1, c1);
//     }
// }
