package C_3;

/**
 * Created by sanak on 18.02.2016.
 */
public class Ex_12 {
    public static void main(String[] args) {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i <<= 1;
        System.out.println(Integer.toBinaryString(i));
        i>>>=1;
        System.out.println(Integer.toBinaryString(i));
        i>>>=1;
        System.out.println(Integer.toBinaryString(i));
    }
}
