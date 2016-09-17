package C_3;

/**
 * Created by sanak on 18.02.2016.
 */
public class Ex_10 {
    public static void main(String[] args) {
        int a = 0x5555;
        int b = 0xaaaa;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(~b));
        System.out.println(Integer.toBinaryString(a&b));
        System.out.println(Integer.toBinaryString(a|b));
        System.out.println(Integer.toBinaryString(a^b));

    }
}
