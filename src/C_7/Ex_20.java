package C_7;

/**
 * Created by Alex on 12.06.2016.
 */
class WithFinal{
    private final void f(){
        System.out.println("WithFinal method");
    }

}
class OverrideWithFinal extends WithFinal{

    private final void f(){
        System.out.println("Overridden method");
    }
}
public class Ex_20 extends OverrideWithFinal{

    public final void f(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new Ex_20().f();
    }
}
