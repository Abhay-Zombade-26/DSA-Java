//Basic methods in ArrayList .
package ArrayList;

import java.util.*;

public class demo1{
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();

         //for adding elements in ArrayList
         l1.add(10);
         l1.add(20);
         l1.add(30);
         l1.add(40);
         l1.add(50);

         //for displaying the ArrayList
         System.out.println("display: "+l1); // In terms of like [10,20,30,40,50]

         //for modifing the ArrayList
         l1.set(2,25);
         System.out.println("modify: "+l1);

         //for deleting the particular index
         l1.remove(2);
         System.out.println("delete: "+l1);

         //for getting the paricular index element
         System.out.println("get element 0th index: "+l1.get(0));

         //for checking elements in ArrayList or not,return boolean value.
         boolean check=l1.contains(30);
         System.out.println(check);

         //creating a new ArrayList with different datatypes.
         ArrayList<Object> l2=new ArrayList<>();//don't specify the wrapper class inside the <>.
         l2.add("Abhay");
         l2.add(10);
         l2.add(10.3f);
         l2.add(true);
         l2.add('a');
         System.out.println("for storing different datatypes in ArrayList: "+l2);

         //for displaying the size of ArrayList
         System.out.println("returns the size of l2 ArrayList: "+ l2.size());
    }
}


//creation ArrayList and taking i/p ArrayList.

// import java.util.*;

// public class demo1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//          // Step 1: Create ArrayList
//         ArrayList<Integer> list = new ArrayList<>();
//         // Step 2: Take input from user
//         System.out.println("Enter number of elements: ");
//         int n = sc.nextInt();
//         System.out.println("Enter elements:");
//         for(int i=0;i<n;i++) {
//             int num=sc.nextInt();
//             list.add(num);
//         }
//         // Step 3: Print elements
//         System.out.println("ArrayList elements are:");
//         for(int i=0;i<list.size();i++) {
//             System.out.println(list.get(i));
//         }

//     }
// }
