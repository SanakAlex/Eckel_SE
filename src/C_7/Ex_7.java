package C_7;

/**
 * Created by Sanak Alex on 19.05.2016.
 */
class A{
    A(int i){
        System.out.println("class A "+i);
    }
}
class B{
    B(int i){
        System.out.println("class B "+i);
    }
}
class C extends A {
    B field = new B(1);
    C(int i){
        super(i);
        System.out.println("class C "+i);
    }
}
public class Ex_7 {
    public static void main(String[] args) {
        C c = new C(1);
    }
}
