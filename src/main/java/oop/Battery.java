package oop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Battery implements DisChargeable {
    protected String name;

    // Battery has a dimension
    // has a :
    //композиция
    //агрегирование
    //ассоциация
    //делегирование
    private Dimension dimension;
    protected int capacity;

    public Battery(String name, int capacity, Dimension dimension) {
       this.name = name;
        this.dimension = dimension;
       this.capacity = capacity;
   }


   public String getName() {
        return name;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getCharge(int value) {
        if (capacity > value) {
            this.capacity = capacity - value;
            return value;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battery battery = (Battery) o;
        return capacity == battery.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity);
    }

    public List<Battery> sort(List<Battery> batteryList){
      //  Collections.sort(batteryList, (w1, w2) -> (w2.getCapacity().compareTo(w2.getCapacity());
        Collections.sort(batteryList, new Comparator<Battery>() {
            @Override
            public int compare(Battery o1, Battery o2) { if(o1.capacity==o2.capacity){
                return 0;
            }
                if(o1.capacity<o2.capacity){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });
        System.out.println(batteryList);
        return batteryList;
    }
}
class nameComparator implements Comparator<Battery> {


    @Override
    public int compare(Battery o1, Battery o2) {
      if(o1.capacity==o2.capacity){
          return 0;
      }
      if(o1.capacity<o2.capacity){
          return 1;
      }
      else {
          return -1;
      }
    }

    public static void main(String[] args) {
    //    Battery b1 = new Battery("battery1",10,'2','5');
    }

    }

