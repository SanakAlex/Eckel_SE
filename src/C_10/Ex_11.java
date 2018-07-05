package C_10;

interface SimpleInterface {
    void print();
}

class SimpleInterfaceImpl {
    private class SI implements SimpleInterface {

        @Override
        public void print() {
            System.out.println("Hello, buddy");
        }
    }
    SimpleInterface get() {
        return new SI();
    }
}

public class Ex_11 {
    public static void main(String[] args) {
        SimpleInterface simpleInterface = new SimpleInterfaceImpl().get();
//!        SimpleInterfaceImpl.SI si = (SI) new SimpleInterfaceImpl().get();
//!        si.print();
    }
}


