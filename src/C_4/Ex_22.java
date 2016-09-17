package C_4;

import static net.mindview.util.Print.*;

/**
 * Created by sanak on 22.02.2016.
 */
public class Ex_22 {
    public static void main(String[] args) {
        for (int i=1;i<5;i++) {
            switch (i){
                case 1:
                    print("first case");
                case 2:
                    print("second case");
                default:
                    print("default case");
            }
        }
    }
}
