public class BlankFinal {
    private final int j;
    private final Puppet p;

    public BlankFinal(){
        j=1;
        p=new Puppet(1);
    }
    public BlankFinal(int x){
        j=x;
        p=new Puppet(x);
    }

    @Override
    public String toString() {
        return "BlankFinal{" +
                "j=" + j +
                ", p=" + p +
                '}';
    }

    public static void main(String[] args) {
        BlankFinal bf1 = new BlankFinal();
        BlankFinal bf2 = new BlankFinal(5);
        System.out.println(bf1);
        System.out.println(bf2);
       // bf1.p=new Puppet(10);// cannot assign values to final variables p
       // bf2.p= new Puppet(20);
    }
}
class Puppet{
    private int i;

    public Puppet(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Puppet{" +
                "i=" + i +
                '}';
    }
}