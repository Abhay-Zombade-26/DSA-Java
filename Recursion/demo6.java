//sum of digits.

package Recursion;

import java.util.*;

public class demo6 {
    public static int display(int n){
       if(n>=0 && n<=9){ 
         return  n;     
      }
       return display(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=sc.nextInt();
        System.out.println("digits sum is:"+display(n));
    }

}
