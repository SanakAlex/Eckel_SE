package C_11;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex_12 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list.size() + " size");
        ListIterator<Integer> integerListIterator = list.listIterator(list.size());
        while (integerListIterator.hasPrevious()) {
            System.out.println(integerListIterator.previousIndex());
            list2.add(integerListIterator.previous());
        }

        System.out.println(list);
        System.out.println(list2);
    }
}
