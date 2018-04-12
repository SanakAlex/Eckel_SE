package C_9;

public class Ex_5_6 implements C_9.Ex_5.Ex_5_6 {
    @Override
    public void method_1() {
        System.out.println("Hello");
    }

    @Override
    public void method_2(int i) {
        System.out.println("number: " + i);
    }

    @Override
    public void method_3(String s) {
        System.out.println("string: " + s);
    }

    public static void main(String[] args) {
        new Ex_5_6().method_1();
        new Ex_5_6().method_2(123);
        new Ex_5_6().method_3("ddd");
    }
}
