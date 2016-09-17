package C_7;

/**
 * Created by Sanak Alex on 19.05.2016.
 */
class Base{
    Base(int i){
        System.out.println("Base constr "+i);
    }
}
class Extended extends Base{
    Extended(){
        super(5);
        System.out.println("default Extend");
    }
    Extended(int i){
        super(i);
        System.out.println("with args Extend "+i);
    }
}

public class Ex_8 {
    public static void main(String[] args) {
        new Extended();
        new Extended(44);
    }
}
