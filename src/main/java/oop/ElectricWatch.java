package oop;

public class ElectricWatch {
    // агрегирование
    private DisChargeable battery;// полиморфизм переменных
    // композиция
    private Dimension dimension;

    public ElectricWatch(Dimension dimension) {
        this.dimension = dimension;
    }



    public int getCharge(int value) {
        return battery.getCharge(value);
    }

    public void setBattery(DisChargeable battery) {
        this.battery = battery;
    }

    public void run() {
        /*int charge = battery.getCharge(10);
        while ( charge > 0) {
            System.out.println("run ");
            charge = battery.getCharge(10);
        }*/

        while ( battery.getCharge(10) > 0) {
            System.out.println("run ");
        }

    }

    public static void main(String[] args) {
        ElectricWatch electricWatch = new ElectricWatch(new Dimension(50, 50));
        Battery b = new Battery("varta", 100, new Dimension(10, 10));
        electricWatch.setBattery(b);
        electricWatch.run();
        electricWatch.setBattery(new Accumulator("varta2", 100, 10, 10));
        electricWatch.run();
        electricWatch = null;
    }
}
