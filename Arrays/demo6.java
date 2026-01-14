//check whether the array is sorted or not

package Arrays;

public class demo6 {
     public static boolean display(int arr[]){
        boolean check=true;
         for(int i=0;i<arr.length-1;i++){
             if(arr[i]>arr[i+1]){
                 check=false;
             }
         }
         return check;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
      if(display(arr)==true){
          System.out.println("array is sorted");
      }else{
          System.out.println("array is unsorted");
      }
    }
}