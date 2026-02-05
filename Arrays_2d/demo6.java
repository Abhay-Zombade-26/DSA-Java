//give a positive integer n,generate an n*n matrix filled with elements from 1 to n^2 in spiral order.

package Arrays_2d;

import java.util.*;

public class demo6 {
    public static void display(int arr[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiralMatrix(int arr[][],int r,int c){
           int left=0,right=c-1,top=0,bottom=r-1;
           int count=1;
           while(count<=r*c){
           for(int i=left;i<=right && count<=r*c;i++){
            arr[top][i]=count++;
           }
           top++;
           for(int j=top;j<=bottom && count<=r*c;j++){
            arr[j][right]=count++;
           }
           right--;
           for(int i=right;i>=left && count<=r*c;i--){
            arr[bottom][i]=count++;
           }
           bottom--;
           for(int j=bottom;j>=top && count<=r*c;j--){
            arr[j][left]=count++;
           }
           left++;
       }  
       display(arr, r, c);
    }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Spiral matrix elements");
        spiralMatrix(arr, n, n);
    }
}   

