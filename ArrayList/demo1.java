//creation ArrayList and taking i/p ArrayList.

package ArrayList;

import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         // Step 1: Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // Step 2: Take input from user
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
            int num=sc.nextInt();
            list.add(num);
        }
        // Step 3: Print elements
        System.out.println("ArrayList elements are:");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

    }
}
