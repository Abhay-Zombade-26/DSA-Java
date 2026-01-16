//Find the first duplicate element in an array

package Arrays;

public class demo11 {
    public static int test(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length;j++){
            if(i!=j && arr[i]==arr[j]){
               return arr[i];
            }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[]={10,20,20,70,270};
        System.out.println("value:"+test(arr));
    
  }
}