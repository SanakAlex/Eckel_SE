package java_8_for_impatient.с_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Ex_1 {

    @Test
    void perform() {
        final long currentThreadId = Thread.currentThread().getId();
        String[] array = {"a", "b", "x", "c", "k"};
        //sort
        CopyOnWriteArraySet<Long> threadIds = new CopyOnWriteArraySet<>();
        Arrays.sort(array, (a, b) -> {
            threadIds.add(Thread.currentThread().getId());
            return a.compareTo(b);
        });
        assertEquals(1, threadIds.size());
        assertEquals(currentThreadId, threadIds.toArray()[0]);
        //parallelSort
        threadIds.clear();
        Arrays.parallelSort(array, (a, b) -> {
            threadIds.add(Thread.currentThread().getId());
            return a.compareTo(b);
        });
        assertTrue(threadIds.size() > 1);
    }
}
