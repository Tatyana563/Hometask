package oop;

import java.util.Objects;

public class TestStored {

    public static void main(String[] args) {
        NumberStored<Double> stored = new NumberStored(10D);
        NumberStored<Integer> stored2 = new NumberStored(10);
        NumberStored<String> stored3 = new NumberStored("stre");
        //System.out.println((Number)stored.getValue() + (Number)stored2.getValue());
        if (stored.getValue() instanceof Number && stored2.getValue() instanceof Number ) {
            Number n1 = (Number) stored.getValue();
            Number n2 = (Number) stored.getValue();
            System.out.println(n1.intValue() + n2.intValue());
        }
        System.out.println(stored.getValue()+stored2.getValue());
    }
}
