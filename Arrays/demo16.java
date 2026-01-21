//Sorting an array of 0s and 1s

package Arrays;

class demo16{
    public static void swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void display(int arr[]){
        int i=0 ,j=arr.length-1;
        while(j>i){
            if(arr[i]==1 && arr[j]==0){
                swap(i, j,arr);
                i++;
                j--;
            }
           else if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
        }
    }
    public static void show(int[] arr) {
                int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};
        System.out.println("O.G. array");
        show(arr);
        display(arr);
        System.out.println("Sorted array");
        show(arr);
    }
}

//Sorting an array of even and odd numbers.

// import java.util.*;

// class demo16{ 
//     public static void swap(int arr[],int i,int j){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     public static void display(int arr[]){
//         int j=arr.length-1;
//         int i=0;
//         while(i<j){
//             if(arr[i]%2!=0 && arr[j]%2==0){
//                 swap(arr,i,j);
//                 i++;
//                 j--;
//                }
//                if(arr[i]%2==0){
//                    i++;
//                }else if(arr[j]%2!=0){
//                    j--;
//                }
//             }
//         }
//     public static void main(String[] args) {
//         int arr[]={10,26,15,21,30,45};
//         System.out.println("O.G. array");
//         System.out.println(Arrays.toString(arr));
//         display(arr);
//         System.out.println("new array");
//         System.out.println(Arrays.toString(arr));
//     }
// }



