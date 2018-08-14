package C_13;

import java.math.BigInteger;
import java.util.Formatter;
import java.util.Locale;

import static net.mindview.util.Print.print;

public class Ex_5 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out, Locale.US);
        char u = 'a';
        print("u = 'a'");
//        formatter.format("s: %1$-#10s\n", u);
        formatter.format("c: %1$-10c\n", u);
        formatter.format("b: %1$-10.10b\n", u);
        formatter.format("h: %1$-10.10h\n", u);
        int v = 1000;
        print("v = 1000");
        formatter.format("d 1: %1$(,0+10d\n", v);
        formatter.format("d 2: %1$-(, 10d\n", v);
        formatter.format("d 3, v = -v: %1$-(, 10d\n", -v);
        formatter.format("c, v = 121: %1$-10c\n", 121);
        formatter.format("b: %1$-10.10b\n", v);
//        formatter.format("s: %1$#-10.10s\n", v);
        formatter.format("x: %1$-#10x\n", v);
        formatter.format("h: %1$-10.10h\n", v);
        BigInteger w = new BigInteger("50000000000000");
        print("w = new BigInteger(\"50000000000000\")");
        formatter.format("d 1: %1$(,0+10d\n", w);
        formatter.format("d 2: %1$-(, 10d\n", w);
        formatter.format("d 3, w = -w: %1$-(, 10d\n", w.negate());
        formatter.format("b: %1$-10.10b\n", w);
//        formatter.format("s: %1$#-10.10s\n", w);
        formatter.format("x 1: %1$(0+10x\n", w);
        formatter.format("x 2: %1$-( 10x\n", w);
        formatter.format("x 3, w = -w: %1$-( 10x\n", w.negate());
        formatter.format("h: %1$-10.10h\n", w);
        double x = 179.543;
        print("x = 179.543");
        formatter.format("b: %1$-10.10b\n", x);
//        formatter.format("s: %1$#-10.10s\n", x);
        formatter.format("f 1: %1$#(,0+10.2f\n", x);
        formatter.format("f 2: %1$#(,- 10.2f\n", x);
        formatter.format("f 3, x = -x: %1$#(,0+10.2f\n", -x);
        formatter.format("e 1: %1$#(0+10.2e\n", x);
        formatter.format("e 2: %1$#(- 10.2e\n", x);
        formatter.format("e 3, x = -x: %1$#(0+10.2e\n", -x);
        formatter.format("h: %1$-10.10h\n", x);
        Object y = new Object();
        print("y = new Object()");
        formatter.format("b: %1$-10.10b\n", y);
//        formatter.format("s: %1$#-10.10s\n", y);
        formatter.format("h: %1$-10.10h\n", y);
        boolean z = false;
        print("z = false");
        formatter.format("b: %1$-10.10b\n", z);
//        formatter.format("s: %1$#-10.10s\n", z);
        formatter.format("h: %1$-10.10h\n", z);
        // A special no argument conversion type
        formatter.format("%%: %-10%");
    }
}
