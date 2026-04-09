//Display the greatest common divisor use brute force approach first for logic.

package practice_questions;

import java.util.*;

class demo8 {
    public static int display(int a,int b){
        int result=0;
        for(int i=Math.min(a , b);i>=1;i--){  // take the minimum no. first for saving some iteration.
            if(a%i==0 && b%i==0){
                result=i;
                break;
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a 1st no.");
        int a=sc.nextInt();
        System.out.println("enter a 2nd no.");
        int b=sc.nextInt();
        System.out.println("greatest common divisior is: "+display(a,b));
    }
}

/*
Time complexity:-O(min(a,b))
space complexity:-O(1)

*/











