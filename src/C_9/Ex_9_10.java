package C_9;

import java.util.Random;

import static net.mindview.util.Print.print;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT // Etc.
}

interface Playable {
    void play(Note note);
}

abstract class Instrument {
//    abstract void play(Note n);
    public String toString() { return "Instrument"; }
    abstract void adjust();
}

class Wind extends Instrument implements Playable {
    public void play(Note n) { print("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument implements Playable {
    public void play(Note n) { print("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument implements Playable {
    public void play(Note n) { print("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { print("Adjusting Stringed"); }
}

class Keyboard extends Instrument implements Playable {
    public void play(Note n) { print("Keyboard.play() " + n); }
    public String toString() { return "Keyboard"; }
    void adjust() { print("Adjusting Keyboard"); }
}

class Brass extends Wind {
    public void play(Note n) { print("Brass.play() " + n); }
    void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
    public void play(Note n) { print("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}

public class Ex_9_10 {
    private static void tune(Playable i) {
        i.play(Note.MIDDLE_C);
    }

    private static void showInstrument(Instrument i){
        System.out.println(i);
    }

    private static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }

    public static void main(String[] args) {
        Playable[] orchestra = {
                new Brass(),
                new Keyboard(),
                new Percussion(),
                new Stringed(),
                new Woodwind()
        };

        tuneAll(orchestra);
    }
}
