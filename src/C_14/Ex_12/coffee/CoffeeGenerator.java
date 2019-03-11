//: generics/coffee/CoffeeGenerator.java
// Generate different types of Coffee:
package C_14.Ex_12.coffee;

import java.util.*;

import net.mindview.util.*;

import static java.util.Arrays.asList;

public class CoffeeGenerator
        implements Generator<Coffee>, Iterable<Coffee> {
    private static Class[] types = {Latte.class, Mocha.class,
            Cappuccino.class, Americano.class, Breve.class,};
    private static Random rand = new Random(47);

    public CoffeeGenerator() {
    }

    // For iteration:
    private int size = 0;

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    @SuppressWarnings("unchecked")
    public static List<Class<? extends Coffee>> getTypes() {
        List<Class<? extends Coffee>> classes = Collections.unmodifiableList(Arrays.asList(Latte.class, Mocha.class,
                Cappuccino.class, Americano.class, Breve.class));
        return classes;
    }

    public Coffee next() {
        try {
            return (Coffee)
                    types[rand.nextInt(types.length)].newInstance();
            // Report programmer errors at run time:
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    }

    ;

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static Coffee[] createArray(int size) {
        Coffee[] result = new Coffee[size];
        CoffeeGenerator coffees = new CoffeeGenerator(size);
        for (int i = 0; i < size; i++)
            result[i] = (coffees.next());
        return result;
    }

    public static ArrayList<Coffee> arrayList(int size) {
        ArrayList<Coffee> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for (Coffee c : new CoffeeGenerator(5))
            System.out.println(c);
    }
} /* Output:
Americano 0
Latte 1
Americano 2
Mocha 3
Mocha 4
Breve 5
Americano 6
Latte 7
Cappuccino 8
Cappuccino 9
*///:~
