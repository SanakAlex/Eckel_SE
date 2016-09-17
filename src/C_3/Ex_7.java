package C_3;

import java.util.Random;

/**
 * Created by Alex on 08.02.2016.
 */
public class Ex_7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(2);
        if (i == 0) System.out.println("орел");
        if (i == 1) System.out.println("решка");
        System.out.println(i);
    }
}
