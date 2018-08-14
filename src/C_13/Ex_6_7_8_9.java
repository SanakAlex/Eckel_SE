package C_13;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Ex_6_7_8_9 {
    private int i;
    private long l;
    private float f;
    private double d;

    public Ex_6_7_8_9(int i, long l, float f, double d) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format(" i: %1$10d\n l: %2$10d\n f: %3$10.3f\n d: %4$10.5f", i, l, f, d);
    }

    public static void main(String[] args) {
        Ex_6_7_8_9 ex_678 = new Ex_6_7_8_9(25, 2444, 24.556f, 24.598745d);
        System.out.println(ex_678);

        System.out.println("------------Ex_7-------------------");

        Pattern pattern = Pattern.compile("[A-Z].*\\.");
        System.out.println(pattern.matcher("This is correct.").matches());
        System.out.println("This is correct.");
        boolean shortVariant = Pattern.matches("[A-Z].*\\.","This is correct.");
        System.out.println(shortVariant);
        System.out.println("------------Ex_8-------------------");

        String knights =
                "Then, when you have found the shrubbery, you must " +
                        "cut down the mightiest tree in the forest... " +
                        "with... a herring!";
        System.out.println(Arrays.toString(knights.split("the|you")));

        System.out.println("------------Ex_9-------------------");

        System.out.println(knights.replaceAll("[aeiou]", "_"));
    }
}
