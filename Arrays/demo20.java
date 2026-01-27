//Return prefix and sufix array without using any etc array.

package Arrays;

import java.util.*;

public class demo20 {
    public static void checker(int arr[]){
        System.out.println("prefix sum:");
        int prr[]=displayPrefixSum(arr.clone());
        System.out.println(Arrays.toString(prr));
        System.out.println("suffix sum:");
        int srr[]=displaySufixSum(arr.clone());
        System.out.println(Arrays.toString(srr));
    }
    public static int[] displaySufixSum(int arr[]){
        int n=arr.length-2;
        for(int i=n;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];
        }
        return arr;
    }
    public static int[] displayPrefixSum(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={10,30,40,65,70};                  //[10, 40, 80, 145, 215]            215,205,175,135,70
        System.out.println("O.G. array");
        System.out.println(Arrays.toString(arr));
        checker(arr);
    }
}
