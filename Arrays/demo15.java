//Check whether a number is present in an array or not using a function.

package Arrays;

import java.util.*;

public class demo15 {
    public static String display(int arr[],int test){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==test){
                return "yes";
            }
        }
                return "no";
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no for comparision:");
        int n=sc.nextInt();
        int test;
        for(int i=1;i<=n;i++){
       System.out.println("enter no.to check in array");
             test=sc.nextInt();
            System.out.println(display(arr,test));
        }

}
}
