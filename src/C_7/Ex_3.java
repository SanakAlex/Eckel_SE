package C_7;

import static net.mindview.util.Print.print;

/**
 * Created by Sanak Alex on 19.05.2016.
 */

    class Art {
        Art() { print("Art constructor"); }
    }

    class Drawing extends Art {
        Drawing() { print("Drawing constructor"); }
    }

    public class Ex_3 extends Drawing {
        public static void main(String[] args) {
            Ex_3 x = new Ex_3();
        }
    }


