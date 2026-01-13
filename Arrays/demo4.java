package Arrays;

public class demo4 {
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[]={10,20,30,40,50};
         System.out.println("Original array:");
         display(arr);
       
         int shallow_clone[]=arr;
            shallow_clone[0]=99;
            shallow_clone[1]=88;
            System.out.println("After modifying shallow_clone array:");
            display(shallow_clone);
              System.out.println("After modifying shallow_clone Original array:");
            display(arr);

            int deep_clone[]=arr.clone();
            deep_clone[0]=77;
            deep_clone[1]=66;
            System.out.println("After modifying deep_clone array:");
            display(deep_clone);
              System.out.println("After modifying deep_clone Original array:");
            display(arr);

    }
    
}
