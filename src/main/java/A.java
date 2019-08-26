public class A {
    public A(int a) {
        System.out.println("constructor Q");
    }
}
class B{
    public B(int b) {
        System.out.println("constructor B");
    }

    @Override
    public String toString() {
        return "B{}";
    }
}
class C extends A{
    public C(int a, int v) {
        super(a);
    }

     B b = new B(65);

    @Override
    public String toString() {
        return "C{" +
                "b=" + b +
                '}';
    }

    public static void main(String[] args) {
        C c = new C(8,7);
        System.out.println(c);
    }
}