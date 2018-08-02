package C_11;

import java.util.PriorityQueue;
import java.util.Random;

public class Ex_28_29 {

    class SimpleClass {}

    public static void main(String[] args) {
        PriorityQueue<Double> doubles = new PriorityQueue<>();
        Random random = new Random(28);
        for (int i = 0; i < 15; i++) {
            doubles.offer(random.nextDouble());
        }

        for (int i = 0; i < doubles.size(); i++) {
            System.out.println(doubles.poll());
        }

        System.out.println("------------Ex_29-------------");

        PriorityQueue<SimpleClass> simpleClasses = new PriorityQueue<>();
        Ex_28_29 ex_28_29 = new Ex_28_29();

        simpleClasses.offer(ex_28_29.new SimpleClass());

        simpleClasses.offer(ex_28_29.new SimpleClass());
    }
}