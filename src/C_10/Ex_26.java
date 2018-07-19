package C_10;

class WithInnerForExtending {
    class Inner{
        public Inner(int valueToPrint) {
            System.out.println(valueToPrint);
        }
    }
}

public class Ex_26 {
    class Inherited extends WithInnerForExtending.Inner {
        public Inherited(WithInnerForExtending withInnerForExtending, int valueToPrint) {
            withInnerForExtending.super(valueToPrint);
        }

        void hello() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Ex_26 ex_26 = new Ex_26();
        Inherited inherited = ex_26.new Inherited(new WithInnerForExtending(), 15);
        inherited.hello();
    }
}
