/*
Theory notes and practice qn for basic to advance to calculate Time and space complexity.
1. Time Complexity (Theory)
Definition:
Time complexity tells us how much time an algorithm takes to run, depending on the input size.
It does NOT measure actual time in seconds
It measures the number of operations performed
Represented using Big-O notation.
 
Common Time Complexities:

Big-O	Meaning	
---------------------------------
O(1)	Constant time	
O(n)	Linear time	Loop through array
O(n²)	Quadratic time
O(log n)	Logarithmic time	Binary search

2. Space Complexity (Theory)

Definition:
Space complexity tells us how much extra memory an algorithm uses, depending on input size.
It includes:
Variables
Arrays
Objects
Function calls

Example:
Using only one variable → O(1)
Using extra array of size n → O(n)

*/

package Time_Space_complexity;

import java.util.*;

// //this code will require to execute n number of time.
// // Time =O(n)

// public class demo1 {
//     public static void display(int n){
//         int ans=0;
//         for(int i=1;i<=n;i++){
//             ans+=i;
//         }
//         System.out.println("First n natural sum is:"+ans);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the n Number: ");
//         int n=sc.nextInt();
//         display(n);
//     }
// }

//this code is the optimized solution ans for this question
//Time =O(1)
// public class demo1 {
//     public static void display(int n){
//         int ans=0;
//         ans=n*(n+1)/2;
//       System.out.println("First n natural sum is:"+ans);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the n Number: ");
//         int n=sc.nextInt();
//         display(n);
//     }
// }

//--------------------------------------------------------- Day 2 -------------------------------------------------------------------------------
/* 
Asymptotic Notation (define)
Definition:
Asymptotic notation is used to describe the performance (time or space) of an algorithm when the input size becomes very large (n → infinity).
It shows how fast or slow an algorithm grows, not exact time.
Types:-
Big-O (O): Shows worst case time complexity of algorithm.
Omega (Ω): Shows best case time complexity of algorithm.
Theta (Θ): Shows average case time complexity of algorithm.

| Notation | Case         | Meaning      |
| -------- | ------------ | ------------ |
| O(n)     | Worst case   | Maximum time |
| Ω(n)     | Best case    | Minimum time |
| Θ(n)     | Average case | Normal time  |

*/

//ex., Time complexity=O(n+m)

// public class demo1{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         int arr2[]={10,20,30,40,50};
//         int ans=0;   //ignore this type of all instructions for calculating the time complexity
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");  //this for loop block will execute till n time 
//         }
//         for(int j=0;j<arr2.length;j++){
//             System.out.println(arr2[j]+" "); //this for loop block will execute till m time 
//         }
//     }                                        //final result is:- O(n+m)
// }    

//ex., Time complexity=O(n^2)

// public class demo1{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){      //this loop will run n times
//             for(int j=1;j<=n;j++){   //this loop will run also n times 
//                 System.out.print(i*j+" ");  //total time will require for result O(n*n)
//            } 
//            System.out.println();
//         }
//     }                                 
// }    

//ex., for Time complexity O(n*√n)
public class demo1{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){      //this loop will run n times
            for(int j=1;j<=Math.sqrt(i);j++){   //this loop will run also root of n times 
                System.out.print(i+" "+j+" ");  //total time will require for result O(n*√n)
           } 
           System.out.println();
        }
    }                                 
}  


