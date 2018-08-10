package C_12;

class MyOwnException2 extends Exception {
}

public class Ex_10_11 {
    public void g() throws MyOwnException {
        System.out.println("g()");
        throw new MyOwnException();
    }

    public void f() throws MyOwnException2 {
        try {
            System.out.println("f()");
            g();
        } catch (MyOwnException e) {
            throw new MyOwnException2();
        }
    }

    public void fForEx11() throws MyOwnException2 {
        try {
            System.out.println("f()");
            g();
        } catch (MyOwnException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws MyOwnException2 {
        Ex_10_11 ex_10_11 = new Ex_10_11();
//        ex_10_11.f();
        ex_10_11.fForEx11();
    }
}
