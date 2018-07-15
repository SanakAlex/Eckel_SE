package C_10;

interface Nested {
    void method();
}

public class Ex_18 {

    private static Nested nestedClass =
            new Nested() {
                @Override
                public void method() {
                    System.out.println("Nested class");
                }
            };



    public static void main(String[] args) {
        nestedClass.method();
    }
}
