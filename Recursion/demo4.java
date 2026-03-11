//WAP for Power of a Number.

package Recursion;

import java.util.*;

public class demo4{

    public static int display(int x, int n){
        if(n==0)
            return 1;
        return x*display(x, n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        System.out.println("Result = "+display(x,n));
    }
}