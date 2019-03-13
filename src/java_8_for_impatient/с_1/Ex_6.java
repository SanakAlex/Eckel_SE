package java_8_for_impatient.с_1;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

class Ex_6 {

    @Test
    void perform() {
        new Thread(uncheck(() -> {
            System.out.println("Zzz");
            Thread.sleep(100);
        })).start();
    }

    private Runnable uncheck(RunnableI runnable) {
        return () -> {
            try {
                runnable.run();
            } catch (Exception ignored) {}
        };
    }

    @FunctionalInterface
    interface RunnableI {
        void run() throws InterruptedException;
    }
}
