//Find all triplets in an array whose sum is equal to a given target sum.

package Arrays;

import java.util.*;
public class demo8 {

    public static void targetSum(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                if(arr[i]+arr[j]+arr[k]==target){
                    System.out.println("Indices are: "+i+", "+j+" and "+k);
                }
            }
        }
    }
}
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
         Scanner sc=new Scanner(System.in);
            System.out.print("Enter the target sum: ");
            int target=sc.nextInt();
           targetSum(arr,target);
    }
}
