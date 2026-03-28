package Recursion;

//find the sum of n natural sum but in alternate sign way like 1-2+3-4+5...n

 import java.util.*;

public class demo8 {
    public static int display(int n){
        if(n==0){
            return n;
        }
        if(n%2!=0){
          return display(n-1)+n;// here recursion will give the n-1 alternate sign sum just trust the recusrion the add the n if n is odd
        }else{
            return display(n-1)-n;// here recursion will give the n-1 alternate sign sum just trust the recusrion the subtract the n if n is even
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter a value of no:");
        int n=sc.nextInt();
       System.out.println(display(n));
    }
}
/* time complexity:-O(n) and space also be the O(n) */


//find the sum of n natural sum like ., 1+2+3+4+.....n  

// import java.util.*;

// public class demo8 {
//     public static int display(int n){
//         if(n==0){
//             return n;
//         }
//        return display(n-1)+n;
//     }
//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//         System.out.println("enter a value of no:");
//         int n=sc.nextInt();
//        System.out.println(display(n));
//     }
// }

/*   for this qn time complexity is O(n) and space is also O(n) */

