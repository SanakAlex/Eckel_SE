package C_4;

import java.util.Random;

/**
 * Created by sanak on 21.02.2016.
 */
public class Ex_17 {
    public static void main(String[] args) {
        int[] mass = new int[25];
        Random rand = new Random(45);
        for (int i=0;i<25;i++){
            mass[i] = rand.nextInt(100);
        }
        while(true){
            Ex_16.compare(mass);
        }
    }
}
