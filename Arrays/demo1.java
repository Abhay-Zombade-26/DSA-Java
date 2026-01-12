//Demo program to find sum of array elements.

package Arrays;

public class demo1 {
    public static void main(String[] args) {
        int sum =0;
        int arr[]={10,20,30,40,50};
        for(int i=0;i<=arr.length-1;i++){
            sum += arr[i];
        }
        System.out.println("sum of array elements:"+sum);
    }
    
}
