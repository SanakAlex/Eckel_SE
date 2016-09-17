package C_8;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * Created by Alex on 27.08.2016.
 */

class Shape {
    public void draw() {}
    public void erase() {}
    public void update() {}
}

class Circle extends Shape {
    @Override
    public void draw() { print("Circle.draw()"); }
    @Override
    public void erase() { print("Circle.erase()"); }
    @Override
    public  void update() { print("Circle.update()");}
}

class Square extends Shape {
    @Override
    public void draw() { print("Square.draw()"); }
    @Override
    public void erase() { print("Square.erase()"); }
    @Override
    public  void update() { print("Square.update()");}
}

class Triangle extends Shape {
    @Override
    public void draw() { print("Triangle.draw()"); }
    @Override
    public void erase() { print("Triangle.erase()"); }
    @Override
    public  void update() { print("Triangle.update()");}
}

class Oval extends Shape {
    @Override
    public void draw() { print("Oval.draw()"); }
    @Override
    public void erase() { print("Oval.erase()"); }
    @Override
    public  void update() { print("Oval.update()");}
}

class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Oval();
        }
    }
}

public class Ex_2_3_4 {
    public static void main(String[] args) {
        RandomShapeGenerator gemerator = new RandomShapeGenerator();
        Shape shapes[] = new Shape[9];
        for (int i = 0; i < 9; i++)
        {
            shapes[i] = gemerator.next();
        }
        for (Shape shp : shapes)
        {
            shp.update();
        }
    }
}
