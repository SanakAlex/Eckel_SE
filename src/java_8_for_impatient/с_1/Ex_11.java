package java_8_for_impatient.с_1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex_11 {

    @Test
    void perfotm() {
        Collection2<Integer> c = new ArrayList2<>();
        c.add(100);
        c.add(-5);
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        c.forEachIf(set::add, e -> e > 0);
        assertEquals(1, set.size());
        assertEquals(100, set.toArray()[0]);
    }

    interface Collection2<T> extends Collection<T> {
        default void forEachIf(Consumer<T> action, Predicate<T> filter) {
            forEach(t -> {
                if (filter.test(t)) {
                    action.accept(t);
                }
            });
        }
    }

    private class ArrayList2<T> extends ArrayList<T> implements Collection2<T> {}

}

