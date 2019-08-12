import java.util.*;

public class Accumulator1 implements Comparable<Accumulator1>{
    String name;
    Double height;
    Double width;

    public Accumulator1(String name, Double height, Double width) {
        this.name = name;
        this.height = height;
        this.width = width;

    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Accumulator{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public Collection<Accumulator1> sort (List<Accumulator1> accumulator1List){
        Comparator<Accumulator1> compareByName = Comparator
                .comparing(Accumulator1::getHeight)
                .thenComparing(Accumulator1::getWidth).reversed();
        Collections.sort(accumulator1List,compareByName);
        System.out.println(accumulator1List);

        return accumulator1List;
    }

    public static void main(String[] args) {
        Accumulator1 a1 = new Accumulator1("a1",10.0,11.0);
        Accumulator1 a2 = new Accumulator1("a2",10.0,8.0);
        Accumulator1 a3 = new Accumulator1("a3",9.0,12.0);
        Accumulator1 a4 = new Accumulator1("a4",9.0,11.0);
        Accumulator1 a5 = new Accumulator1("a5",15.0,13.0);
        Set<Accumulator1> list = new TreeSet<>(Comparator
                .comparing(Accumulator1::getHeight)
                .thenComparing(Accumulator1::getWidth).reversed());
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        List<Accumulator1> list2 = new ArrayList<>();
        list2.add(a1);
        list2.add(a2);
        list2.add(a3);
        list2.add(a4);
        list2.add(a5);
        Collections.sort(list2, (Accumulator1 ac1, Accumulator1 ac2)->{
            int compare1 = ac1.height.compareTo(ac2.height);
            int compare2 = ac1.width.compareTo(ac2.width);

            return compare1 == 0 && compare2 == 0 ? 0 :
                    (compare1 + compare2 == 2 )? 1 :
                            (compare1 > 0 &&  compare2 == 0) ? 1 : 0;

        });
        System.out.println(list2);
        System.out.println("This is a branch_1");

    }

   // @Override
    public int compareTo(Accumulator1 o) {
        return 0;
    }
}


