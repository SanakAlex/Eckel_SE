package C_10;

public class Ex_12 {

    private int val = 8;

    private void print() {
        System.out.println("Hello " + val);
    }

    public MyClass getMyClass(int changer) {
        return new MyClass() {
            {
                val -= changer;
                print();
            }
        };
    }

    public static void main(String[] args) {
        MyClass myClass = new Ex_12().getMyClass(12);
    }
}

interface MyClass {}
