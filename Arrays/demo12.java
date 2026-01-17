// Reverse an array without using extra array space o(1)

package Arrays;

public class demo12 {
      public static void display(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
    }
}
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
         System.out.println("O.G. array:");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
         System.out.println();
        System.out.println("Reverse array:");
        display(arr);
    }
}


// remove comments to use alternative method (using extra array space o(n))

// import java.util.*;

// class demo12 {
//     public static int[] display(int arr[]){
//         int n=arr.length;
//         int nar[]=new int[n];
//         int j=0;
//         for(int i=n-1;i>=0;i--){
//             nar[j++]=arr[i];
//         }
//         return nar;
// }
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40,50};
//          System.out.println("O.G. array:");
//         for(int k=0;k<arr.length;k++){
//             System.out.print(arr[k]+" ");
//         }
//          System.out.println();
//          int test[]=display(arr);
//         System.out.println("Reverse array:"+Arrays.toString(test));
//     }
// }
