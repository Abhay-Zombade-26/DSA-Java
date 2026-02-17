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
public class demo1 {
    public static void display(int n){
        int ans=0;
        ans=n*(n+1)/2;
      System.out.println("First n natural sum is:"+ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n Number: ");
        int n=sc.nextInt();
        display(n);
    }
}

