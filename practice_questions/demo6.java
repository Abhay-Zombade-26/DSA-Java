//check wheather no is prime or not.

package practice_questions;

import java.util.*;

public class demo6 {
    public static void prime(int n){
        if(n<=1){
            System.out.println("Not a prime number");
            return;
        }
        boolean Prime = true;
        for(int i=2;i<=n/2;i++) {
            if(n%i==0) {
                Prime = false;
                break;
            }
        }
        if(Prime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("enter the no:");
    prime(n);
  }    
}
