//addition of 2 matrix.

package Arrays_2d;

import java.util.*;

public class demo1 {

    public static void display(int arr[][]) {
        System.out.println("2d array is");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] add(int arr1[][], int arr2[][]){
        int narr[][] = new int[2][2];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                narr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return narr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[2][2];
        int arr2[][] = new int[2][2];
        System.out.println("enter the 2d array i/p as array1:");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the 2d array i/p as array2:");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int result[][] = add(arr1, arr2);
        display(result);
    }
}


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
