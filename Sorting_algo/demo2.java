//Selction sort .
//time complexity:=n^2

package Sorting_algo;

public class demo2 {
  public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selection(int arr[]){
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                   min_index=j;
                }
            }
            k=arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = k;
        }
    }
    public static void main(String[] args) {
        int arr[]={40,10,50,66,93,72,2,30,20};
        System.out.println("O.G. array: ");
        show(arr);
        System.out.println("sorted array:");
        selection(arr);
        show(arr);
    }  
}