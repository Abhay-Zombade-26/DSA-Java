//Remove duplicates from ArrayList.
package ArrayList;

import java.util.*;

public class demo6 {
    public static void display(ArrayList<Integer> l1) {
        for (int i= 0;i<l1.size(); i++) {
            for (int j=i+1;j<l1.size(); j++) {
                if (l1.get(i).equals(l1.get(j))) {
                    l1.remove(j);
                    j--;// important step after removing
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        System.out.println("Original ArrayList: " + l1);
        display(l1);   
        System.out.println("After removing duplicates: " + l1);
    }   
}
