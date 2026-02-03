//print the spiral matrix elements for provided matrix. 

package Arrays_2d;

import java.util.*;

public class demo5 {

    public static void display(int arr[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiralMatrix(int arr[][],int r1,int c1){
        int top=0,
        bottom=r1-1,
        left=0,
        right=c1-1;
        int count=0;
        while(count<r1*c1){
             // for Top row
        for (int i=left;i<=right && count<r1*c1;i++) {
            System.out.print(arr[top][i]+ " ");
            count++;
        }
        top++;

        // for Right column
        for (int i=top;i<=bottom && count< r1*c1;i++) {
            System.out.print(arr[i][right]+" ");
            count++;
        }
        right--;

        //for Bottom row
        for (int i=right;i>=left && count< r1*c1;i--) {
            System.out.print(arr[bottom][i]+" ");
            count++;
        }
        bottom--;

        // for Left column
        for (int i=bottom;i>=top && count< r1*c1; i--) {
            System.out.print(arr[i][left]+" ");
            count++;
        }
        left++;
    }
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
        System.out.println("Spiral matrix elements");
        spiralMatrix(arr, r1, c1);
    }
}
