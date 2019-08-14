package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class testingDelete {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,60,25,1,2,5,6,7,8,15);
        System.out.println(list);
     Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
