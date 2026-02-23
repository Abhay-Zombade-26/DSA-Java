//sort the ArrayList.
package ArrayList;

import java.util.*;
public class demo7 {
    public static void sortList(ArrayList<Integer> l1) {
        for(int i =0;i<l1.size()-1;i++) {
            for(int j=0;j<l1.size()-1-i;j++) {
                if(l1.get(j)>l1.get(j + 1)) {
                    int temp = l1.get(j);
                    l1.set(j, l1.get(j+1));
                    l1.set(j+1,temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(40);
        l1.add(10);
        l1.add(30);
        l1.add(20);
        sortList(l1);   
        System.out.println("Sorted list: " + l1);
    }
}


//sort ArrayList without using get() and set().
// import java.util.*;
// public class demo7{
//     public static void sortList(ArrayList<Integer> l1) {
//         Collections.sort(l1);//this method inside the ArrayList Package.
//    }
//     public static void main(String[] args) {
//         ArrayList<Integer> l1 = new ArrayList<>();
//         l1.add(40);
//         l1.add(10);
//         l1.add(30);
//         l1.add(20);
//         sortList(l1);
//         System.out.println("Sorted List without using get and set: "+ l1);
//     }
//  }
