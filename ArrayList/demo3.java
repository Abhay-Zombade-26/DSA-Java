//Remove all even numbers.

package ArrayList;

import java.util.*;

public class demo3 {
    public static void display(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++) {
            if(list.get(i)%2==0) {
                list.remove(i);
                i--; //After remove(),elements shift left,so we used i-- to avoid skipping elements here.
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        display(list);
        System.out.println("After removing even number in ArrayList: "+ list);
    }
}
