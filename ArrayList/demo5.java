//display second largest element in ArrayList.

package ArrayList;

import java.util.*;

public class demo5 {
    public static int findSecondLargest(ArrayList<Integer> l1) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i=0;i<l1.size();i++) {
            int num=l1.get(i);
            if(num>largest) {
                secondLargest=largest;
                largest=num;
            } 
            else if(num>secondLargest && num!=largest) {
                secondLargest=num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i=0;i<n;i++) {
            l1.add(sc.nextInt());
        }
        System.out.println("O.G. ArrayList: "+ l1);
        int result = findSecondLargest(l1);
        System.out.println("Second Largest Element: " + result);
    }
}
