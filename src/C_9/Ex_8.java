package C_9;

import static net.mindview.util.Print.print;


interface FastFood {
    void create();
    void eat();
}

class Meal {
    Meal() { print("Meals()"); }
}

class Bread {
    Bread() { print("Bread()"); }
}

class Cheese {
    Cheese() { print("Cheese()"); }
}

class Lettuce {
    Lettuce() { print("Lettuce()"); }
}

class Pickle {
    Pickle() { print("Pickle()");}
}



class Sandwich implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        print("Sandwich()");
    }

    @Override
    public void create() {
        System.out.println("Sandwich created");
    }

    @Override
    public void eat() {
        System.out.println("Eat sandwich");
    }
}

public class Ex_8 {

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.create();
        sandwich.eat();
    }
}
