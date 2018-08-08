package C_12;

class MyOwnException extends Exception {
    private String exceptionMessage;

    MyOwnException() {}

    MyOwnException(String s) {
        super(s);
        exceptionMessage = s;
    }

    public void displayExceptionMessage() {
        System.out.println(exceptionMessage);
    }
}

public class Ex_4 {
    public static void main(String[] args) {
        try {
            throw new MyOwnException("Exception message");
        } catch (MyOwnException e) {
            e.displayExceptionMessage();
        }
    }
}
