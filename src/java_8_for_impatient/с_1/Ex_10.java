package java_8_for_impatient.с_1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ex_10 {

    @Test
    void perform() {
        String[] names = {"Vasya", "Petya", "Kolya"};
        List<Runnable> runners = new ArrayList<>();
        for (String name : names) {
            runners.add(() -> System.out.println(name));
        }
        for (Runnable runner : runners) {
            new Thread(runner).start();
        }
        runners.clear();
        for (int i = 0; i < names.length; i++) {
            int finalI = i;
            runners.add(() -> System.out.println(names[finalI]));
        }
        for (Runnable runner : runners) {
            new Thread(runner).start();
        }

    }
}
