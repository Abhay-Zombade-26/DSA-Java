//Copy Elements from One ArrayList to Another.

package ArrayList;

import java.util.*;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        for(int i=0;i<list1.size();i++) {
            list2.add(list1.get(i));
        }
        System.out.println("List1: "+ list1);
        System.out.println("copy List: "+ list2);
    }
}
