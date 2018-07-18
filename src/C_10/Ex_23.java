package C_10;

interface U {
    void a();
    void b();
    void c();
}

class A {
    U getU () {
        return new U() {
            @Override
            public void a() {
                System.out.println("a");
            }

            @Override
            public void b() {
                System.out.println("b");
            }

            @Override
            public void c() {
                System.out.println("c");
            }
        };
    }
}

class B {
    U[] array;

    B(int size) {
        array = new U[size];
    }

    void addU(U u) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = u;
                return;
            }
        }
    }

    void nullU(int element) {
            if (array[element] != null) {
                array[element] = null;
            }
    }

    void iterate() {
        for (U anArray : array) {
            if (anArray == null)
                continue;
            anArray.a();
            anArray.b();
            anArray.c();
        }
    }
}

public class Ex_23 {
    public static void main(String[] args) {
        B b = new B(4);
        A[] as = {new A(),new A(),new A(),new A()};
        for (A a : as) {
            b.addU(a.getU());
        }
        b.iterate();
        System.out.println("--------");
        b.nullU(0);
        b.iterate();
    }
}
