//print the nth fibonacci series.

package Recursion;

import java.util.*;

public class demo3 {
    public static int display(int n){
        if(n==0 || n==1){
            return n;
        }
        return display(n-1)+display(n-2);
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term for finding fiboncci series:");
        int n=sc.nextInt();
        System.out.println("fibonacci series:");
        for(int i=0;i<n;i++){
        System.out.print(display(i)+" ");
        }
     }    
}

//Time and space complexity is:-
 
/*
Time:-for function call it create like., display(n)=display(n-1)+display(n-2) ...(So each function call creates 2 more calls.)
recurrence tree is.

                f(5)
            /           \
         f(4)           f(3)
       /      \        /     \
    f(3)      f(2)   f(2)   f(1)
   /    \     /   \
 f(2)  f(1) f(1) f(0)


Level 0 → 1 call
Level 1 → 2 calls
Level 2 → 4 calls
Level 3 → 8 calls(approximately)
represent it in Geometric progresion is:- 2^0 + 2^1 + 2^2 + 2^3 + 2^4 + ... 2^n
Gp=2^n -1 => 2^n so .,
Time complexity is=> O(2^n)
space:-Stack memory created for nth time so., O(n)
*/