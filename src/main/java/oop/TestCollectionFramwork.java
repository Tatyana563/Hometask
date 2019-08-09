package oop;

import java.util.*;

public class TestCollectionFramwork {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(20);
        array.add(10);
        array.add(10);
        array.add(10);

        /*System.out.println(array);
        array.add(2, 10);
        System.out.println(array);
        array.set(1, 30);
        System.out.println(array);

        System.out.println(array.indexOf(10));*/

        /*for (int i = 0; i < array.size(); i++) {
            System.out.println("iteration " + i);
            System.out.println(array);
            if (array.get(i) == 10) {
                System.out.println("delete on iteration " + i + " size = " + array.size());
                array.remove(i);
            }
        }*/

        for (Iterator<Integer> iterator = array.iterator();
             iterator.hasNext();) {
            Integer value = iterator.next();
            if (value == 10) {
                iterator.remove();
            }
        }

        for (ListIterator<Integer> iterator = array.listIterator();
             iterator.hasNext();) {
            Integer value = iterator.next();
            if (value == 10) {
                iterator.set(20);
            }
        }


        //iterable
        /*for (Battery value: new BatteryCollector()) {

        }

        //iterator
        for (BatteryCollector it = new BatteryCollector(); it.hasNext(); ) {
            Battery value = it.next();


        }*/

        System.out.println(array);

        /*for(Integer value: array) {
            array.remove(Integer.valueOf(10));
        }*/

        Set<Integer> sets = new HashSet<>();
        sets.add(5);
        sets.add(4);
        sets.add(80);
        sets.add(17);
        sets.add(16);
        sets.contains(Integer.valueOf(16));
        System.out.println(sets);
    }
}
