package C_11;

import java.util.*;

public class Ex_11 {
    public static void printCollectionValues(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        List<String> strings = new ArrayList<>();
        Queue<Integer> integers = new PriorityQueue<>();
        for (int i = 0; i < 6; i++) {
            set.add(new Object());
            strings.add(Integer.toBinaryString(i));
            integers.add(25 * i);
        }
        printCollectionValues(set);
        printCollectionValues(strings);
        printCollectionValues(integers);
    }
}
