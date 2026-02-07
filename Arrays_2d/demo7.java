//sum of 2d matrix elements of given range(brute force approach).

package Arrays_2d;

import java.util.*;

public class demo7 {
    public static int displaySum(int arr[][],int r1,int c1,int r2,int c2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
             sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for n*m matrix");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("enter the 2d array element");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value for r1 and c1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
         System.out.println("Enter the value for r2 and c2");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
       System.out.println("sum of elements is:"+displaySum(arr,r1,c1,r2,c2));
    }
}
