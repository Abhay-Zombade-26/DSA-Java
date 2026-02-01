//Accept the matrix and display in 90 degree clockwise direction.

package Arrays_2d;

import java.util.*;

public class demo3 {
    public static void display(int arr[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transpose(int arr[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=i+1;j<c1;j++){
                arr[i][j]=arr[i][j]+arr[j][i];
                arr[j][i]=arr[i][j]-arr[j][i];
                arr[i][j]=arr[i][j]-arr[j][i];
            }
        }
    }
    public static void reverse(int arr[]){
          int i=0;  int j=arr.length-1;
          while(i<j){
            int temp=arr[i];     //here we use without temp also as same as transpose matrix logic.
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
          }
    }
    public static void rotate(int arr[][],int n){
        transpose(arr, n, n);
        for(int i=0;i<n;i++){
            reverse(arr[i]);
        }
       display(arr, n, n);
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
        display(arr,r1,c1);
        System.out.println("90 degree clockwise matrix");
        rotate(arr, r1);
    }   
}
