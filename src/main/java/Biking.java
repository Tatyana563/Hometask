class Cycle {
private int wheels;
    public void ride(){
        System.out.println("You can ride");
    }
   public int wheels(){
        return wheels;
   }

    }

class Unicycle extends Cycle{
    private int wheels=1;
    public void ride(){
        super.ride();
        System.out.println("You can ride Unicycle");
    }

    @Override
    public int wheels() {
        return wheels;
    }
}
class Bicycle extends Cycle{
    private int wheels=2;
    public void ride(){
        super.ride();
        System.out.println("You can ride Bicycle");
    }
}
class Tricycle extends Cycle {
    private int wheels=3;
    public void ride() {
        super.ride();
        System.out.println("You can ride Tricycle");
    }
}
    public class Biking{
        public static void travel(Cycle c){
            c.ride();
            System.out.println(c.wheels());
        }

        public static void main(String[] args) {
            Unicycle unicycle = new Unicycle();
            travel(unicycle);
        }
    }
