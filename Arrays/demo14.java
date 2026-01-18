//approach to a right Rotate an array by k times(without extra space).Time complexity=O(n),Space complexity=O(1).

package Arrays;

import java.util.*;

public class demo14 {
    public static void display(int arr[]){
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[],int srt,int end){
        while(srt<end){
            int temp=arr[srt];
            arr[srt]=arr[end];
            arr[end]=temp;
            srt++;
            end--;
        }
    }
    public static void rotate(int arr[],int k,int n){
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        display(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        int n=arr.length;
        System.out.println("enter kth rotations:");
        int k=sc.nextInt();
        System.out.println("O.G array");
        display(arr);
        System.out.println();
        System.out.println("Rotated array");
        rotate(arr,k,n);
    }
}
