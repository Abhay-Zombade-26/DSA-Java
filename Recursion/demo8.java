package Recursion;

//find the sum of n natural sum like ., 1+2+3+4+.....n  

import java.util.*;

public class demo8 {
    public static int display(int n){
        if(n==1){
            return n;
        }
       return display(n-1)+n;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter a value of no:");
        int n=sc.nextInt();
       System.out.println(display(n));
    }
}

/*   for this qn time complexity is O(n) and space is also O(n) */
