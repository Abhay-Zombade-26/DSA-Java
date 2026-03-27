//print the first k multiples of a number using recursion.

package Recursion;

import java.util.*;

public class demo7 {
    public static void display(int num,int k){
        if (k==0) {
            return;
        }
        display(num, k-1);

        System.out.print(num * k+"  ");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value of no:");
        int n=sc.nextInt();
        System.out.println("enter a value of k:");
        int k=sc.nextInt();
        display(n,k);
    }
}



//sum of digits using recursion (just solved one more time for practice)

// import java.util.*;

// public class demo7 {
//     public static int display(int n){
//         if(n>=0 && n<=9){
//             return n;
//         }
//         return n%10 + display(n/10);

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("Sum of digits:"+display(n));
//     }
// }
