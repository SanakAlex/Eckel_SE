package C_7;

/**
 * Created by Sanak Alex on 19.05.2016.
 */
public class Ex_5 {
    static class A{
        A(){
            System.out.println("class A");
        }
    }
    static class B{
        B(){
            System.out.println("class B");
        }
    }
    static class C extends A{
        B field = new B();

        public static void main(String... args) {
            C c = new C();
        }
    }
}
