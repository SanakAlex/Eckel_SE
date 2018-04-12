package C_9;

//import static net.mindview.util.Print.print;

abstract class Rodent {
    Rodent() {
        System.out.println("Rodent()");
    }
    public String toString(){
        return "Rodent";
    }
    abstract void dispose();
}

class Mouse extends Rodent {
    Mouse() {
        super();
        System.out.println("Mouse()");
    }
    public String toString(){
        return "Mouse";
    }

    @Override
    void dispose() {
        System.out.println("dispose " + this);
    }
}

class Hamster extends Rodent {
    Hamster() {
        super();
        System.out.println("Hamster()");
    }
    public String toString(){
        return "Hamster";
    }

    @Override
    void dispose() {
        System.out.println("dispose " + this);
    }
}

abstract class SomeClass {
    public void hello() {
        System.out.println("Hello");
    }
}

abstract class Ex_3 {
    abstract void print();

    Ex_3() {
        print();
    }

    @Override
    public String toString() {
        return "Ex_3";
    }
}

class Ex3_2 extends Ex_3 {
    private int meaning = 12;

    @Override
    void print() {
        System.out.println(meaning);
    }
}

abstract class Ex_4 {
    abstract void method();
}
class Ex_4_2 extends Ex_4 {

    void method() {
        System.out.println("Ex_4_2");
    }

}


public class Ex_1_2 {
    static void lowChange(Ex_4 ex_4) {
        ex_4.method();
    }

    public static void main(String[] args) {
    Ex3_2 example = new Ex3_2();
    //    SomeClass someClass = new SomeClass();
    example.print();
    lowChange(new Ex_4_2());
}

}
