package C_7;

/**
 * Created by Alex on 12.06.2016.
 */
class Method{
    private final void print() {
        System.out.println("print()");
    }
}

public class Ex_21Extended extends Method{
    final void print(){
        System.out.println("haha");
    }

    public static void main(String[] args) {
        Ex_21Extended ob = new Ex_21Extended();
        ob.print();
    }
}

