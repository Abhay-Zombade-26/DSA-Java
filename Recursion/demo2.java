//print the factorial of n number using recursion.
package Recursion;

import java.util.*;

public class demo2 {
    public static int display(int n){
        int result=0;
        if(n==0){
           return 1;  //base case
        }
      return n*display(n-1); //recrsive and self work 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n for finding factorial no:");
        int n=sc.nextInt();
        System.out.println(display(n));
    }
}
