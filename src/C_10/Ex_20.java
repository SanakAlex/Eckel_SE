package C_10;

interface IForNested {
    class InnerClass {
        public void hello() {
            System.out.println("Hello");
        }
    }

}

class WithInner implements IForNested {

}

public class Ex_20 {

    public static void main(String[] args) {
        IForNested.InnerClass innerClass = new IForNested.InnerClass();
        innerClass.hello();
    }
}
