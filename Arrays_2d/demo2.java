//Accept the r*c matrix and print that matrix transpose.

package Arrays_2d;

import java.util.Scanner;

public class demo2 {
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transpose(int arr1[][],int r1,int c1){
        int narr[][]=new int[r1][c1];
          for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                narr[i][j]=arr1[j][i];
            }
        }
        display(narr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for r1 and c1:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
       
        System.out.println("enter array1 i/p:");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
             }
        }
        
        System.out.println("O.G 2d array");
        display(arr1);
        System.out.println("Transpose matrix");
        transpose(arr1, r1, c1);
    }
}
