package C_5;

import static net.mindview.util.Print.print;

/**
 * Created by Sanak Alex on 25.04.2016.
 */
public class Ex_13 {
    static class Cup {
        Cup(int marker) {
            print("Cup(" + marker + ")");
        }
        void f(int marker) {
            print("f(" + marker + ")");
        }
    }
    static class Cups {
        static Ex_13.Cup cup1;
        static Ex_13.Cup cup2;
        static {
            cup1 = new Ex_13.Cup(1);
            cup2 = new Ex_13.Cup(2);
        }
        Cups() {
            print("Cups()");
        }
    }
    public static void main(String[] args) {
        print("Inside main()");
//        Cups.cup1.f(99);  // (1)
    }
     static Cups cups1 = new Cups();  // (2)
     static Cups cups2 = new Cups();  // (2)
}


