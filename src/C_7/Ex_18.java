package C_7;

import java.util.Random;

/**
 * Created by Alex on 12.06.2016.
 */
public class Ex_18 {
    static Random r = new Random(11);
    final int a = r.nextInt(20);
    static final int A = r.nextInt(20);

    Ex_18(){
        System.out.println("a "+a+" INT_A "+A);
    }
    public static void main(String[] args) {
        new Ex_18();
        new Ex_18();
    }
}
