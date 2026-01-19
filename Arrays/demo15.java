//Check whether a number is present in an array or not using a function.

// package Arrays;

// import java.util.*;

// public class demo15 {
//     public static String display(int arr[],int test){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==test){
//                 return "yes";
//             }
//         }
//                 return "no";
//     }
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40,50};
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter no for comparision:");
//         int n=sc.nextInt();
//         int test;
//         for(int i=1;i<=n;i++){
//        System.out.println("enter no.to check in array");
//              test=sc.nextInt();
//             System.out.println(display(arr,test));
//         }

// }
// }


//Check frequency of elements in an array using function.
//Note:-Value of all the elements in the array is less than 10 to the power 5.  
package Arrays;
import java.util.*;
class demo15{
     public static int[] display(int arr[]){
     int freq[]=new int[100000];
     for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;
     }
       return freq;
     }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int arr[]={10,20,30,40,50,30,90,10};
     int result[]=display(arr);
     System.out.println("enter element of queries");
     int x=sc.nextInt();
     while(x>0){
     System.out.println("enter element to be search in array");
     int se=sc.nextInt();
     if(result[se]>0){
      System.out.println("yes "+result[se]+" times");
     }
     else{
      System.out.println("no");
     }
     x--;
     }
  }
}


