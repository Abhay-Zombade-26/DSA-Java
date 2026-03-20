//WAP for Power of a Number.

package Recursion;

// import java.util.*;

// public class demo4{

//     public static int display(int x, int n){
//         if(n==0)
//             return 1;
//         return x*display(x, n-1);
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter base: ");
//         int x = sc.nextInt();
//         System.out.print("Enter power: ");
//         int n = sc.nextInt();
//         System.out.println("Result = "+display(x,n));
//     }
// }

//time complexity:-O(n)



//Power of a Number with optimized approach.
import java.util.*;

public class demo4{

    public static int display(int x, int n){
        if(n==0){
            return 1;
        }
         int pow=display(x, n/2);
        if(n%2==0){
            return pow*pow;
        }
        else  {
            return pow*pow*x;     
        }
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

//time complexity:- O(logn)