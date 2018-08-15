package C_12;

class FirstException extends Exception {
}

class SecondException extends FirstException{
}

class ThirdException extends SecondException {
}


public class Ex_25 {
    class A {
        public void method() throws FirstException {
            throw new FirstException();
        }
    }

    class B extends A {
        @Override
        public void method() throws SecondException {
            throw new SecondException();
        }
    }

    class C extends B {
        @Override
        public void method() throws ThirdException {
            throw new ThirdException();
        }
    }
    public static void main(String[] args) {
        A a = (new Ex_25()).new C();
        try {
            a.method();
        } catch (FirstException e) {
            e.printStackTrace();
        }
    }
}
