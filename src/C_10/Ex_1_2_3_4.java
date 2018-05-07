package C_10;

class Outer {
    private String string;
    class Inner {
        @Override
        public String toString() {
            return string;
        }
    }

    Outer(String string) {
        this.string = string;
    }

    Inner getInner() {
        return new Inner();
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}

class ClassWithString {
    String s;

    ClassWithString(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }

        public Sequence sequence() {
            return Sequence.this;
        }
    }

    boolean check() {
        return this == ((SequenceSelector)selector()).sequence();
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}

public class Ex_1_2_3_4 {

    public static void main(String[] args) {
        Outer outer = new Outer("Hello");
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner);
        Outer.Inner inner2 = outer.getInner();
        System.out.println(inner2);

        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(new ClassWithString("Item №" + String.valueOf(i + 1)));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println(sequence.check());
    }
}
