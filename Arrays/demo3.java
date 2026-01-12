package Arrays;

import java.util.*;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,10,15,20,25};
        int ans=-1;
        System.out.println("Enter element to search:");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans=i;
                System.out.println("Element found at index: "+ans);
                break;
            }
        }
        if(ans==-1){
            System.out.println("Element not found in array");
        }
    }
    
}
