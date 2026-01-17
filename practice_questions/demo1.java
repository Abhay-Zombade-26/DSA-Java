// Demonstration of swap 2 numbers using call by value in Java

package practice_questions;

public class demo1 {
  
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a="+a+" b="+b);
    }
    public static void main(String[] args) {
       int a=10;
       int b=20;
       System.out.println("Before swapping a="+a+" b="+b);
       swap(a,b);
   }   
}

// Demonstration of swap 2 numbers without using temporary variable in Java


// public class demo1 {
  
//     static void swap(int a,int b){
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println("After swapping a="+a+" b="+b);
//     }
//     public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        System.out.println("Before swapping a="+a+" b="+b);
//        swap(a,b);
//    }   
// }



