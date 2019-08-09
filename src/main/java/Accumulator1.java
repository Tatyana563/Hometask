import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Accumulator1 {
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
//cvvcvcvcvc
        //test
    }

    public List<Accumulator1> sort (List<Accumulator1> accumulator1List){
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
        List<Accumulator1> list = new ArrayList<>();
        Collections.addAll(list,a1,a2,a3,a4,a5);
        a1.sort(list);
    }
}


