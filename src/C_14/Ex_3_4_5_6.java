package C_14;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ex_3_4_5_6 {
    abstract class Shape {
        private boolean checked;

        public boolean isChecked() {
            return checked;
        }

        public void check() {
            this.checked = true;
        }

        public void uncheck() {
            this.checked = false;
        }

        void draw() { System.out.println(this + ".draw()"); }

        public String toString(){
            return "is " + (isChecked() ? "checked" : "not checked");
        }
    }
    class Circle extends Shape {
        public String toString() { return "Circle " + super.toString(); }
    }
    class Square extends Shape {
        public String toString() { return "Square " + super.toString(); }
    }
    class Triangle extends Shape {
        public String toString() { return "Triangle " + super.toString(); }
    }
    class Rhomboid extends Shape {
        public String toString() { return "Triangle " + super.toString(); }
    }

    /**
     * Ex_5 part
     * @param shape to rotate
     */
    static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("instance '" + shape + "' can't be rotated");
            return;
        }
        System.out.println("Rotating");
    }

    /**
     * Ex_6 part
     * @param collection to check shape items in it
     */
    static void matchPolygons(Class<?> shapeClass, Collection<Shape> collection) {
        for (Shape shape : collection) {
            if (shape.getClass().equals(shapeClass)) {
                shape.check();
            }
        }
    }

    public static void main(String[] args) {
        Ex_3_4_5_6 ex_3_4 = new Ex_3_4_5_6();
        List<Shape> shapeList = Arrays.asList(
                ex_3_4.new Circle(), ex_3_4.new Square(), ex_3_4.new Triangle()
        );
        for(Shape shape : shapeList)
            shape.draw();
        Rhomboid rhomboid = ex_3_4.new Rhomboid();
        Shape shape = rhomboid;
        Rhomboid rhomboid1 = (Rhomboid) shape;

/*        shape can't be casted while runtime, but succeed while compilation
!        Circle circle = (Circle) shape;
*/
        System.out.println("------Ex_4------");
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
        }

        System.out.println("----Ex_5------");
        for (Shape shapeItem : shapeList) {
            rotate(shapeItem);
        }

        System.out.println("---Ex_6----");
        matchPolygons(Triangle.class, shapeList);
        matchPolygons(Square.class, shapeList);
        for (Shape shape1 : shapeList) {
            System.out.println(shape1);
        }
    }
}
