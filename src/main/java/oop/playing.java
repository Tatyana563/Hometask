package oop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class playing {
    String name;
    int price;

    public playing(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        playing ball = new playing("myBall",20);
        playing bike = new playing("myBike",50);
        playing doll = new playing("myBDoll",30);
        Set<playing> sets = new HashSet<>();
        sets.add(bike);
        sets.add(ball);
        sets.add(doll);

        if(sets.contains(bike)){
            System.out.println("yes");
        }
       // System.out.println(sets);
    }
}
