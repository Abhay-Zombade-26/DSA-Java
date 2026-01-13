package Arrays;
import java.util.*;

public class demo5 {
    public static void main(String[] args) {
         int arr[]={101,280,30,40,30,50,30,70,80,90};
         Scanner sc=new Scanner(System.in);
         int count=0;
         System.out.println("enter the element to search:");
            int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
             if(arr[i]==key){
                count++;
             }

        }
        System.out.println("The element "+key+" is found "+count+" times in the array.");
    }
}
    

