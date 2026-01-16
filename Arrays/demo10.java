package Arrays;

public class demo10 {
     public static int largest(int arr[]){
        int n=arr.length;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        return min;
    }
    
    public static int Slargest(int arr[]){
       int max=largest(arr);
       for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int seclargest=largest(arr);
        return seclargest;
    }
    public static void main(String[] args) {
        int arr[]={10,70,40,90,50};
        System.out.println("Second largest value:"+Slargest(arr));
        
    }
    
}
