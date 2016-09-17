package C_3;

/**
 * Created by sanak on 19.02.2016.
 */
public class Ex_13 {
    public static void charOutputInBinary (char c){
        int i = c;
        System.out.println(Integer.toBinaryString(i));
    }

    public static void main(String[] args) {
        char d = 'd';
        charOutputInBinary(d);
    }
}
