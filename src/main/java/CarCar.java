public class CarCar {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();
    public CarCar(){
        for(int i=0;i<4;i++){
           wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        CarCar carCar = new CarCar();
        carCar.engine.start();
        carCar.left.window.rollup();
        carCar.engine.service();
    }
}
class Engine{
    public void start(){
        System.out.println("Engine was started");
    };
    public void rev(){};
    public void stop(){};
    public void service(){
        System.out.println("The engine was checked");
    };
}
class Wheel{
    public void inflate(int psi){};
}
class Window{
    public void rollup(){
        System.out.println("The window was rolled up");
    };
    public void rolldown(){};
}
class Door {
    public  Window window = new Window();
    public void open(){};
    public  void close(){};
};