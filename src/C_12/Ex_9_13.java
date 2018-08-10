package C_12;

public class Ex_9_13 {
    static class MyException1 extends Exception {
    }
    static class MyException2 extends Exception {
    }
    static class MyException3 extends Exception {
    }

    public static void raiseException() throws Exception {
        throw new MyException1();
//        unreachable
//        throw new MyException2();
//        throw new MyException3();
    }

    public static void main(String[] args) {
        try {
            raiseException();
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
            throw new NullPointerException();
        } finally {
            System.out.println("------Ex_13--------");
            System.out.println("finally block");
        }
    }
}
