package C_7;

import static net.mindview.util.Print.print;

/**
 * Created by Alex on 02.08.2016.
 */
class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        print(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 =
            printInit("static Beetle.x2 initialized");
    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}
public class Ex_24 extends Beetle {
    private int k = printInit("Ex.k initialized");
    public Ex_24() {
        print("k = " + k);
        print("--------");
        print("j = " + j);
    }

    private static int x3 = printInit("static Ex.x3 initialized");

    public static void main(String[] args) {
        print("Ex constructor");
        Ex_24 b = new Ex_24();
    }
}
