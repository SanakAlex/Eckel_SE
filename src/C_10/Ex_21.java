package C_10;

interface Interface {

    int method(int a);

    class Nested {
        public static void nestedMethod(Interface anInterface) {
            int result = anInterface.method(10);
            System.out.println(result);
        }
    }
}

public class Ex_21 {

    public static void main(String[] args) {
        Interface impl = new Interface() {
            @Override
            public int method(int a) {
                return a * 10;
            }
        };
        Interface.Nested.nestedMethod(impl);
    }
}
