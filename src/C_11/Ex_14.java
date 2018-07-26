package C_11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Ex_14 {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        LinkedList<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            integers.add(integers.size() / 2, i);
            System.out.print(integers + ";\n");
        }
        ListIterator<Integer> integerListIterator = integers1.listIterator();
        for (int i = 0; i < 20; i++) {
            integerListIterator.add(i);
            if (i % 2 == 0) {
                integerListIterator.previous();
            }
        }

        System.out.println(integers);
        System.out.println(integers1);
    }
}
