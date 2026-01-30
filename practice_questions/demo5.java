//check wherther no is armstrong or not.

package practice_questions;

import java.util.*;

public class demo5 {
    public static boolean armstrong(int n) {
        int temp = n;
        int digits = 0;
        int sum = 0;
        while(temp > 0){
            digits++;
            temp /= 10;
        }
        temp = n;
        while(temp > 0){
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(armstrong(n)){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
