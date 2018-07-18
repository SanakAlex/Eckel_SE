package C_10;

class ReverseSequence {
    private Object[] items;
    private int next = 0;
    public ReverseSequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class ReverseSelector implements Selector {
        private int i = items.length - 1;
        public boolean end() { return i == -1; }
        public Object current() { return items[i]; }
        public void next() { if(i >= 0) i--; }
    }
    public Selector selector() {
        return new ReverseSelector();
    }

}

public class Ex_22 {
    public static void main(String[] args) {
        ReverseSequence sequence = new ReverseSequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
