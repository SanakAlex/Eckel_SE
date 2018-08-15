package C_12;

public class Ex_28 {
    class MyException extends RuntimeException {}

    public static void main(String[] args) {
        throw (new Ex_28()).new MyException();
    }

}
