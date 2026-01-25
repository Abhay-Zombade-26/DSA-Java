//Write a code for finding the factorial number.

package practice_questions;

import java.util.*;

public class demo2 {
    public static int display(int no){
        int fact=1;
          for(int i=1;i<=no;i++){
           fact*=i;
        }  
        return fact; 
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the factorial no: ");
    int no=sc.nextInt();
    System.out.println("factorial is :"+display(no));
   }
}