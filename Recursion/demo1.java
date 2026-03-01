/* 
Recursion:=> Recursion is a technique where a function calls itself to solve smaller subproblems until a base condition is reached.
 Important Parts of Recursion

Every recursion has 3 main parts:

1️⃣ Base Case

👉 Base case is the stopping condition.
It tells the function when to stop calling itself.

In above example:

if(n == 0) return;

When n becomes 0, function stops.

Without base case → ❌ infinite recursion → StackOverflowError.

2️⃣ Assumption (Faith)

👉 Assumption means you assume the recursive function already knows how to solve the smaller problem.

In example:

print(n - 1);

We assume:

"print(n-1) will correctly print numbers from n-1 to 1"

We trust the recursion to do its job.

3️⃣ Self Work

👉 Self work means the work done by the current function call.

In example:

System.out.println(n);

That is the work this function does before calling itself.

Easy Formula To Remember

Recursion = Base Case + Self Work + Recursive Call (Assumption)
*/


//Print 1 to n numbers.
package Recursion;

import java.util.*;

public class demo1 {
    public static void display(int n){
        if(n==1){
            System.out.print(n+" "); //base case
            return;
        }
        display(n-1); //reursive call
        System.out.print(n+" "); //self work
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n for printing 1 to n numbers:");
        int n=sc.nextInt();
        display(n);
    }
}
