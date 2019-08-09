import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Battery1 {
    static List<Battery1> batteryList = new ArrayList<Battery1>();
    String name;
    int capacity;
    double height;
    double width;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Battery1(String name, int capacity, double height, double width) {
        this.name = name;
        this.capacity = capacity;
        this.height = height;
        this.width = width;
    }
    public void sort(List<Battery1> list){
        nameComparator1 nameComparator1 = new nameComparator1();
        Collections.sort(list, nameComparator1);
        System.out.println(list);
    }



    @Override
    public String toString() {
        return "Battery{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public static void main(String[] args) {

        Battery1 b1 = new Battery1("b1",10,10,3);
        Battery1 b2 = new Battery1("b2",20,2,9);
        Battery1 b3 = new Battery1("b3",100,5,3);
        Battery1 b4 = new Battery1("b4",30,2,3);
        Collections.addAll(batteryList,b1,b2,b3,b4);
        b1.sort(batteryList);
    }
}

class nameComparator1 implements Comparator<Battery1> {

    public int compare(Battery1 o1, Battery1 o2) {
        if (o1.capacity==o2.capacity) {
            return 0;
        }
        if(o2.capacity<o1.capacity){
            return 1;
        }
        else {
            return -1;
        }
    }

}


