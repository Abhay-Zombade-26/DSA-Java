//sum of digits using recursion

package Recursion;

import java.util.*;

public class demo7 {
    public static int display(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return n%10 + display(n/10);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of digits:"+display(n));
    }
}
