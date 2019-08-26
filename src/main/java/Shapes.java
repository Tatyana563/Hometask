import java.util.Random;

 class RandomShapeGenerator {
	private Random rand = new Random();
	public Shape next() {
		switch(rand.nextInt(4)) {
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
            case 3: return new Rectangular();
		}
	}
}

    class Shape {
	public void draw() {}
	public void erase() {}
	public void print(){
        System.out.println("New method- print");
    }
 }


 class Square extends Shape {
	@Override public void draw() {
        System.out.println("Square.draw()");; }
	@Override public void erase() {
        System.out.println("Square.erase()");
    }
    @Override
     public void print(){
        System.out.println("Method print for Square");
    }
}


 class Triangle extends Shape {
	@Override public void draw() {
        System.out.println("Triangle.draw()");
    }
	@Override public void erase() {
        System.out.println("Triangle.erase()");
    }
 }
class Rectangular extends Shape {
    @Override public void draw() {
        System.out.println("Rectangular.draw()");
    }
    @Override public void erase() {
        System.out.println("Rectangular.erase()");
    }
}

class Circle extends Shape {
    @Override public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override public void erase() {
        System.out.println("Triangle.erase()"); }
}


    public class Shapes {
        private static RandomShapeGenerator gen = new RandomShapeGenerator();

        public static void main(String[] args) {
            Shape[] s = new Shape[10];
            // fill up the array with shapes:
            for (int i = 0; i < s.length; i++)
                s[i] = gen.next();
            // make polymorphic method calls:
            for (Shape shp : s) {
                shp.draw();
                shp.print();


            }
        }
    }

