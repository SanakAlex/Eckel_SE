package C_8;

import static net.mindview.util.Print.print;

/**
 * Created by Alex on 20.09.2016.
 */
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

class Lunch extends Meal {
    Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()");}
}

class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();

    public Sandwich() {
        print("Sandwich()");
    }
}

public class Ex_11 {
    public static void main(String[] args) {
        new Sandwich();
    }
}
