package C_9;

import net.mindview.util.New;

interface First {
    void method_1();
    void method_2();
}

interface Second {
    void method_3();
    void method_4();
}

interface Third {
    void method_5();
    void method_6();
}

interface NewInterface extends First, Second, Third{
    void newMethod();
}

abstract class ParentClass {
    String s;
    ParentClass(String s) {
        this.s = s;
    }
    abstract void abstractMethod();
}

class ClassImpl extends ParentClass implements NewInterface {

    ClassImpl() {
        super("ClassImpl");
    }

    @Override
    public void method_1() {
        System.out.println("method_1");
    }

    @Override
    public void method_2() {
        System.out.println("method_2");
    }

    @Override
    public void method_3() {
        System.out.println("method_3");
    }

    @Override
    public void method_4() {
        System.out.println("method_4");
    }

    @Override
    public void method_5() {
        System.out.println("method_5");
    }

    @Override
    public void method_6() {
        System.out.println("method_6");
    }

    @Override
    public void newMethod() {
        System.out.println("newMethod");
    }

    @Override
    void abstractMethod() {
        System.out.println("Abstract realisation");
    }
}

public class Ex_14_15 {
    static void getFirst(First first) {
        first.method_1();
        first.method_2();
    }

    static void getSecond(Second second) {
        second.method_3();
        second.method_4();
    }

    static void getThird (Third third) {
        third.method_5();
        third.method_6();
    }

    static void getNew (NewInterface newInterface) {
        newInterface.newMethod();
    }

    static void getAbstract (ParentClass parentClass) {
        parentClass.abstractMethod();
    }

    public static void main(String[] args) {
        ClassImpl impl = new ClassImpl();
        getFirst(impl);
        getSecond(impl);
        getThird(impl);
        getNew(impl);
        getAbstract(impl);
    }
}
