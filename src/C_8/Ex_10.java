package C_8;

/**
 * Created by Alex on 17.09.2016.
 */
class BaseClass {
    void firstMethod(){
        System.out.println("Inside first method");
        secondMethod();
    }
    void secondMethod() {
        System.out.println("It's a base class");
    }
}

class InheritedClass extends BaseClass {
    void secondMethod() {
        System.out.println("It's an inherited class");
    }
}
public class Ex_10 {
    public static void main(String[] args) {
        BaseClass c = new InheritedClass();
        c.firstMethod();
    }
}
