package C_11;

import java.util.Iterator;

class SequenceModified extends Sequence {
    public Iterator iterator() {
        return items.iterator();
    }
}

public class Ex_9 {
    public static void main(String[] args) {
        SequenceModified sequenceModified = new SequenceModified();
        for (int i = 0; i < 5; i++) {
            sequenceModified.add(Integer.toString(4));
        }
        Iterator iterator = sequenceModified.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
