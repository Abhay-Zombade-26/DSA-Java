//reverse a number entered by the user
package practice_questions;

import java.util.*;

public class demo7 {
    public static int display(int no){
        int rev=0;
        while(no!=0){
        int d=no%10;   //last digit 
        rev=rev*10+d;  //for reversed no
        no=no/10;       //remove last digit
        }
       return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pls enter the number: ");
        int no=sc.nextInt();
        System.out.println("reverse of "+no+" is "+display(no));
    }
}
