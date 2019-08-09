package oop;

// Accumulator is a Battery

public class Accumulator extends Battery implements DisChargeable{

    public Accumulator(String name, int width, int height, int capacity)
    {
        super(name, capacity, new Dimension(width, height));
    }




    public void setName(String name) {
        if (name == null) return;
        if (this.getName() == null) {
            this.name = name;
        }
    }

    public void charge(int unit) {
        if (unit > capacity) return;
        if (unit <= 0) return;
        this.capacity = capacity + unit;
    }
}
