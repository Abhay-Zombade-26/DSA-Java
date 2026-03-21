//Count Digits of a Number

package Recursion;

import java.util.*;

public class demo5 {
    public static int count(int n){
        if(n == 0)
            return 0;
        return 1+count(n/10);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Digits = " + count(n));
    }
}

//Time comlexity:O(d)...because i will run till digit lenth.. 