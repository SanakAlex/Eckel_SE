package java_8_for_impatient.с_1;

import org.junit.jupiter.api.Test;

public class Ex_9 {

    @Test
    void perform() {
        new Thread(uncheck(() -> {System.out.println("First");}, () -> {System.out.println("Second");})).start();
    }

    private Runnable uncheck(Runnable runnable1, Runnable runnable2) {
        return () -> {
            try {
                runnable1.run();
                runnable2.run();
            } catch (Exception ignored) {
            }
        };
    }
}
