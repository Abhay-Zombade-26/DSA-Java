//reverse the ArrayList (optized soltion)

package ArrayList;

import java.util.*;

public class demo2 {
    public static void reverse(ArrayList<Integer> l1){
        int i=0,j=l1.size()-1;
        while(i<j){             
            Integer temp=Integer.valueOf(l1.get(i));
            l1.set(i,l1.get(j));
            l1.set(j, temp);
            i++;
            j--;
        }
    }
    public static void display(ArrayList<Integer> l1){
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
    ArrayList<Integer> l1=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of ArayList element");
    int n=sc.nextInt();
    System.out.println("enter elements:");
    for(int i=0;i<n;i++){
        int num=sc.nextInt();
        l1.add(num);
     }
    System.out.println("O.G ArrayList:");
    display(l1);    
    System.out.println("reverse ArrayList:");
    reverse(l1);
    display(l1);
   }     
}
