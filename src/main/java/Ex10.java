class ClassA {
    public void method1(){
        System.out.println("method1");
        method2();
    }
    public void method2(){
        System.out.println("method2");
    }
}
class ClassB extends ClassA{
    @Override
    public void method2() {
        System.out.println("method2 for ClassB");
    }
}
public class Ex10{
    public static void main(String[] args) {
        ClassA b = new ClassB();
        b.method1();
    }
}
