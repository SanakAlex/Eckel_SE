package C_11;

import java.util.Collection;
import java.util.Iterator;

public class Ex_30 {

    class CollectionSequence implements Collection<Object> {

        protected Object[] sequence;

        @Override
        public int size() {
            return sequence.length;
        }

        @Override
        public boolean isEmpty() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean contains(Object o) {
            for (Object o1 : sequence) {
                if (o1.equals(o)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Iterator<Object> iterator() {
            return new Iterator<Object>() {
                protected int index;

                @Override
                public boolean hasNext() {
                    return index + 1 < sequence.length;
                }

                @Override
                public Object next() {
                    return sequence[++index];
                }
            };
        }

        @Override
        public Object[] toArray() {
            Object[] objects = new Object[sequence.length];
            System.arraycopy(sequence, 0, objects, 0, sequence.length);
            return objects;
        }

        @Override
        public boolean add(Object o) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean remove(Object o) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection c) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean retainAll(Collection c) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean removeAll(Collection c) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean containsAll(Collection c) {
            for (Object o : c) {
                if (!contains(o)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public <T> T[] toArray(T[] a) {
            if (a.length < sequence.length)
                a = (T[])java.lang.reflect.Array.newInstance(
                        a.getClass().getComponentType(), sequence.length);
            T[] result = a;
            System.arraycopy(sequence, 0, result, 0, sequence.length);
            if (result.length > sequence.length)
                result[sequence.length] = null;
            return result;
        }
    }

}
