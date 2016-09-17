package C_7;

import static net.mindview.util.Print.print;

/**
 * Created by Sanak Alex on 20.05.2016.
 */
public class Ex_13 {
    void hello(){print("Hello void");}
    int hello(int i){print("Hello int"); return 1;}
    float hello(float f){print("Hello float"); return 1.0f;}
}
class Ex_13_2 extends Ex_13{
    void hello(String s){
        print("Hello String");
    }

    public static void main(String[] args) {
        Ex_13_2 e = new Ex_13_2();
        e.hello();
        e.hello(1);
        e.hello(1f);
        e.hello("fff");
    }
}
