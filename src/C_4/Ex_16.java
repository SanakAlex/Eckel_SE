package C_4;

import java.util.Random;

/**
 * Created by sanak on 20.02.2016.
 */
public class Ex_16 {
    public static void compare(int[] mass){
        for (int n:mass) {
            for (int m : mass) {
                System.out.print(n + " compare with " + m);
                if (n > m) System.out.println(" n>m");
                if (n < m) System.out.println(" n<m");
                if (n == m) System.out.println(" n=m");
            }
        }
    }
    public static void main(String[] args) {
        int[] mass = new int[25];
        Random rand = new Random(45);
        for (int i=0;i<25;i++){
            mass[i] = rand.nextInt(100);
        }
        compare(mass);
        }
}
