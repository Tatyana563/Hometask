public class Amhibian {
    protected void eat(){
        System.out.println("Amphibiat eats flies");
    }
    private void grow(){
        System.out.println("They grow fast");
    }
    static void develop(Amhibian a){
        System.out.println("Amphibian develops through stages");
    }
}
class Frog extends Amhibian{
    @Override
    protected void eat() {
        //super.eat();
        System.out.println("Frogs like flies very much!");
    }
static void develop(Amhibian a){
    System.out.println("Frogs develop gradually");
}

    public static void main(String[] args) {
        Frog f1 = new Frog();
        f1.eat();
       Amhibian.develop(f1);

       develop(f1);
       Amhibian f3 = new Frog();

    }
}