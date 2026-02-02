//print the pascal triangle , by using user i/p as row

package Arrays_2d;

import java.util.*;

public class demo4 {
     public static void display(int arr[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void pascal(int n){
        int arr[][]=new int[n][];
        for(int i=0;i<n;i++){
            //for space 
            arr[i]=new int[i+1];
            //for assigning 1t start and end
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<i;j++){
            arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        display(arr, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. for pascal triangle");
        int no=sc.nextInt();
        System.out.println("Pascal triangle is:");
        pascal(no);
    }
}
