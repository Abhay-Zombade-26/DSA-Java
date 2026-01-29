//2d array initialization and taking 2d array i/p as user and display them.

package Arrays_2d;

import java.util.*;

public class demo1 {
    public static void display(int arr[][]) {
        System.out.println("2d array is");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[2][3];
        System.out.println("enter the 2d array i/p:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               arr[i][j]=sc.nextInt();
            }
        }
        display(arr);
    }
}
