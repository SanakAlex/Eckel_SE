package C_11;

import java.util.Iterator;
import java.util.Random;

import static net.mindview.util.Print.print;

public class Ex_31 {
    class Shape {
        public void draw() {}
        public void erase() {}
    }

    class Circle extends Shape {
        public void draw() { print("Circle.draw()"); }
        public void erase() { print("Circle.erase()"); }
    }

    class Square extends Shape {
        public void draw() { print("Square.draw()"); }
        public void erase() { print("Square.erase()"); }
    }

    class Triangle extends Shape {
        public void draw() { print("Triangle.draw()"); }
        public void erase() { print("Triangle.erase()"); }
    }

    class RandomShapeGenerator implements Iterable<Shape> {
        private final Random rand = new Random(47);
        private int size;

        RandomShapeGenerator(int size) {
            this.size = size;
        }

        public Shape nextShape() {
            switch (rand.nextInt(3)) {
                default:
                case 0:
                    return new Circle();
                case 1:
                    return new Square();
                case 2:
                    return new Triangle();
            }
        }

        @Override
        public Iterator<Shape> iterator() {
            return new Iterator<Shape>() {
                protected int index;

                @Override
                public boolean hasNext() {
                    return index < size;
                }

                @Override
                public Shape next() {
                    ++index;
                    return nextShape();
                }
            };
        }
    }

    public static void main(String[] args) {
        Ex_31 ex_31 = new Ex_31();
        RandomShapeGenerator generator = ex_31.new RandomShapeGenerator(5);

        for (Shape shape : generator) {
            System.out.println(shape.getClass().getName());
        }
    }
}
