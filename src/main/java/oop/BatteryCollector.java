package oop;

import java.util.ArrayList;
import java.util.Iterator;

public class BatteryCollector implements Iterator<Battery>, Iterable<Battery> {
    private ArrayList<DisChargeable> batteries = new ArrayList<>();
    private DisChargeable[] array = new DisChargeable[10];
    private int index = 0;

    public void add(DisChargeable battery) {
        batteries.add(battery);
    }

    public DisChargeable getBattery(int index) {
        return batteries.get(index);
    }

    public void delete(int index) {
        batteries.remove(index);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Battery next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public Iterator<Battery> iterator() {
        return null;
    }
}
