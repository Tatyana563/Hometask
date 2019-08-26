public class Catroon extends Drawing{
    public static void main(String[] args) {
        Catroon c = new Catroon();

    }
}
class Art{
    Art(){
        System.out.println("art constructor");
    }
}
class Drawing extends Art{
    Drawing(){
        System.out.println("drawing constructor");
    }
}