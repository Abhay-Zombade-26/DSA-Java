//Demo program to find maximum element in an array.

package Arrays;

public class demo2 {
    public static void main(String[] args) {
        int arr[]={20,10,50,30,40};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(ans<arr[i]){
                ans=arr[i];
            }
        }
        System.out.println("Maximum element in array is: "+ans);
    }
}
