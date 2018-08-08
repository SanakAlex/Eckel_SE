package C_12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Ex_6_7 {
    static class MyException1 extends Exception {
        private static Logger logger = Logger.getLogger("MyException1");
        MyException1() {
            StringWriter trace = new StringWriter();
            printStackTrace(new PrintWriter(trace));
            logger.severe(trace.toString());
        }
    }
    static class MyException2 extends Exception {
        private static Logger logger = Logger.getLogger("MyException2");
        MyException2() {
            StringWriter trace = new StringWriter();
            printStackTrace(new PrintWriter(trace));
            logger.severe(trace.toString());
        }
    }

    private static Logger loggerInner = Logger.getLogger("Exception");

    public static void displayExceptionInfo(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        loggerInner.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new MyException1();
        } catch (MyException1 exception1) {
            try {
                throw new MyException2();
            } catch (MyException2 exception2) {
                System.err.println("end");
            }
        }

        System.err.println("--------Ex_7---------------");

        Integer[] integers = new Integer[2];
        try {
            integers[2] = 25;
        } catch (ArrayIndexOutOfBoundsException e) {
            displayExceptionInfo(e);
        }
    }
}
