package C_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SomeClass {

}

public class Ex_7 {

    public static void main(String[] args) {
        SomeClass[] someClasses = {
                new SomeClass(),new SomeClass(),new SomeClass(), new SomeClass(), new SomeClass()
        };
        System.out.println("someClass[]: " + Arrays.toString(someClasses));
        List<SomeClass> list = new ArrayList<>();
        Collections.addAll(list, someClasses);
        System.out.println("List: " + list);

        List sub = list.subList(2, 4);
        System.out.println("sub: " + sub);

        list.removeAll(sub);
        System.out.println("Updated list" + list);
    }
}
