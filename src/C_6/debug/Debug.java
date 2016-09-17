package C_6.debug;

import C_6.Ex_5;

/**
 * Created by Sanak Alex on 30.04.2016.
 */
public class Debug {
    public static void debug(String s) {
        System.out.print("I'm a debug package ");
        System.out.println(s);
    }

    public static void main(String[] args) {
        Ex_5 ex_5 = new Ex_5();
        ex_5.printPublic();
    }
}
