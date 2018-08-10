package C_12;

import static net.mindview.util.Print.print;

public class Ex_14_15 {
    class Switch {
        private boolean state = false;
        public boolean read() { return state; }
        public void on() { state = true; print(this); }
        public void off() { state = false; print(this); }
        public String toString() { return state ? "on" : "off"; }
    }

    class OnOffException1 extends Exception {}
    class OnOffException2 extends Exception {}

    private static Switch sw = (new Ex_14_15()).new Switch();
    public static void f()
            throws OnOffException1,OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw exceptions...
            f();
            throw new RuntimeException();
//            sw.off();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        } finally {
            System.out.println("------Ex_15---------");
            sw.off();
        }
    }
}
