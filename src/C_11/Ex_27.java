package C_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ex_27 {

    class Comand {
        private String field;

        Comand(String field) {
            this.field = field;
        }

        public void operation() {
            System.out.println(field);
        }
    }

    class QueueFiller {
        public void fillQueue(Queue<Comand> queue) {
            for (int i = 0; i < (new Random(28).nextInt(15)); i++) {
                queue.offer(new Comand(String.valueOf(i)));
            }
        }
    }

    static class ComandOperator {
        public static void operateWithQueueOfComends(Queue<Comand> comands) {
            for (Comand comand : comands) {
                comand.operation();
            }
        }
    }

    public static void main(String[] args) {
        Ex_27 ex_27 = new Ex_27();
        QueueFiller queueFiller = ex_27.new QueueFiller();
        Queue<Comand> queue = new LinkedList<>();
        queueFiller.fillQueue(queue);
        ComandOperator.operateWithQueueOfComends(queue);
    }
}
