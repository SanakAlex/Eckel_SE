package C_10;

public class Ex_13 {

    MyInterface getMyInterface() {
        return new MyInterface() {
            {
                method();
            }
            @Override
            public void method() {
                System.out.println("I'm anonymous class");
            }
        };
    }

    public static void main(String[] args) {
        MyInterface myInterface = new Ex_13().getMyInterface();
    }
}

interface MyInterface {
    void method();
}
