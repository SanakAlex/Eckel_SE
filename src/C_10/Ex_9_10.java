package C_10;

interface E_Ex_9 {
    void method();
}

public class Ex_9_10 {

    E_Ex_9 inner_method() {
        class E_Ex_9_Impl implements E_Ex_9 {
            @Override
            public void method() {
                System.out.println("Inner method");
            }
        }
        return new E_Ex_9_Impl();
    }

    public static void main(String[] args) {
        E_Ex_9 e_ex_9 = new Ex_9_10().inner_method();
        e_ex_9.method();
    }
}
