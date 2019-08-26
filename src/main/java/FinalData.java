import java.util.Random;

public class FinalData {
    private final int v1 = 10;
    private static final int VALUE_TWO=11;
    private final Value value1 = new Value(15);
    private final int v4=random.nextInt(20);
   // static final int V_5 = random.nextInt(50);???????????????
    private static Random random = new Random(100);
    private int id;

    public FinalData(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FinalData{" +
                "v1=" + v1 +
                ", value1=" + value1 +
                ", v4=" + v4 +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        FinalData f1 = new FinalData(1);
      //  f1.v1++;// прим тип
      // VALUE_TWO=11;
        System.out.println(f1.value1.i+1);//значение менять можно
       // f1.value1 = new Value(20);//нельзя менять ссылку
        FinalData f2 = new FinalData(2);
        System.out.println(f1);
        System.out.println(f2);
    }
}
class Value{
    int i;

    public Value(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Value{" +
                "i=" + i +
                '}';
    }
}
