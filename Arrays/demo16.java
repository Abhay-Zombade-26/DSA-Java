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
