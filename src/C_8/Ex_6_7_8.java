package C_8;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by Alex on 08.09.2016.
 */
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
}

class Instrument {
    void play(Note n) { print("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }
    void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
    void play(Note n) { print("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { print("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { print("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { print("Adjusting Stringed"); }
}

class Keyboard extends Instrument {
    void play(Note n) { print("Keyboard.play() " + n); }
    public String toString() { return "Keyboard"; }
    void adjust() { print("Adjusting Keyboard"); }
}

class Brass extends Wind {
    void play(Note n) { print("Brass.play() " + n); }
    void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { print("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}

class RandomInstrumentGenerator {
    private static Random random = new Random();
    public static Instrument nextInstrument(){
        switch (random.nextInt(6)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Keyboard();
            case 4: return new Brass();
            case 5: return new Woodwind();
        }
    }
}

public class Ex_6_7_8 {
    private static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    private static void showInstrument(Instrument i){
        System.out.println(i);
    }

    private static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }

    private static void showAll(Instrument[] e){
        for(Instrument i : e){
            showInstrument(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = new Instrument[new Random().nextInt(5)+1];
        for (int i = 0; i < orchestra.length; i++){
            orchestra[i] = RandomInstrumentGenerator.nextInstrument();
        }
        showAll(orchestra);
        System.out.println();
        tuneAll(orchestra);
    }
}
