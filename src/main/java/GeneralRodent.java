import java.util.Random;

public class GeneralRodent {
    private static RandomRodentGenerator randomRodentGenerator = new RandomRodentGenerator();
public static void eat(Rodent r){
    r.eat();
}
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[5];
        for(int i=0;i<rodents.length;i++) {
            rodents[i] = randomRodentGenerator.createRodent();
        }
            for(Rodent item:rodents){
                System.out.println(item);
                item.eat();
                item.grow();
                item.sleep();
            }



    }
}
class Rodent{
    void grow(){
        System.out.println("Rodents grow fast");
    }
    void sleep(){
        System.out.println("Rodents sleep well");
    }
    void eat(){
        System.out.println("eat wheet");
    }

    @Override
    public String toString() {
        return "Rodent{}";
    }
}

class Mouse extends Rodent{
    @Override
    void grow() {

        System.out.println("Mouse grows fast");
    }

    @Override
    void sleep() {
        System.out.println("Mouse sleeps well");
    }

    @Override
    public String toString() {
        return "Mouse{}";
    }
}
class Haster extends Rodent{
    @Override
    void grow() {
        System.out.println("Hamster grows slowly");
    }

    @Override
    void sleep() {
        System.out.println("Hamster sleeps during the day");
    }

    @Override
    public String toString() {
        return "Haster{}";
    }
}
class RandomRodentGenerator{
    private Random random = new Random();
    public Rodent createRodent(){
        switch (random.nextInt(2)){
            default:
                case 0: return new Mouse();
            case 1: return  new Rodent();
        }
    }
}