import java.util.Random;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }
    public String toString() { return "Instrument"; }
    void adjust() {
        System.out.println("Adjusting Instrument");; }
}
enum Note{
    a,b,c,d;
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
    public String toString() { return "Wind"; }
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }
    public String toString() { return "Percussion"; }
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
    public String toString() { return "Stringed"; }
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
    public String toString() { return "Brass"; }
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);; }
    public String toString() { return "Woodwind"; }
}

public class Music6 {
    private static RandomInsrumentGenerator randomInsrumentGenerator = new RandomInsrumentGenerator();
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        //...
        i.play(Note.c);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = new Instrument[8];
        for(int i=0;i<orchestra.length;i++){
            orchestra[i]=randomInsrumentGenerator.next();
        }
        tuneAll(orchestra);
        for(Instrument i : orchestra)
            System.out.println(i);
    }
}
class RandomInsrumentGenerator{
    private Random random = new Random(50);
    public Instrument next(){
        switch(random.nextInt(5)){
            default:
            case 0: return new Wind();
            case 1:return new Percussion();
            case 2: return new Stringed();
            case 3:return new Brass();
            case 4:return new Woodwind();
        }

    }
}