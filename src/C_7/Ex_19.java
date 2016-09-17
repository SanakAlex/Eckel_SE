package C_7;

import java.util.Random;

/**
 * Created by Alex on 12.06.2016.
 */
public class Ex_19 {
    final Integer i;

    Ex_19() {
        i = (new Random()).nextInt(20);
        System.out.println(i);
    }

    public static void main(String[] args) {
        new Ex_19();
        new Ex_19();
        new Ex_19();
    }
}
