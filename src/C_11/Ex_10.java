package C_11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static net.mindview.util.Print.print;

enum Meals {
    MEAT, FRUIT, NUT, GRASS
}

class Corn {
    private int referenceCounter;
    private static int counter;
    private  final int id = counter++;
    Corn() {
        System.out.println("Create new corn " + id);
    }
    void addReference(){
        referenceCounter++;
    }
    void deleteReference(){
        System.out.println("Delete reference " + this.getReferenceId());
        referenceCounter--;
    }
    int getReferenceId(){
        return referenceCounter;
    }

    public String toString() {
        return "Corn " + id;
    }
    void dispose() {
        if(referenceCounter == 0){
            print("disposing " + this);
        }
    }
}

class Rodent {
    private Corn corn;
    Rodent(Corn corn) {
        this.corn = corn;
        corn.addReference();
        System.out.println("Create new reference: "+corn.getReferenceId());
        System.out.println("Rodent()");
    }
    void eat(Meals meals){
        System.out.println(this + " eats " + meals);
    }
    public String toString(){
        return "Rodent";
    }
    void dispose() {
        print("disposing " + this);
        corn.deleteReference();
        corn.dispose();
    }
}

public class Ex_10 {
    public static void main(String[] args) {
        List<Rodent> array = new ArrayList();

        for (int i = 0; i < 5; i++) {
            array.add(new Rodent(new Corn()));
        }
        Iterator<Rodent> iterator = array.iterator();
        while (iterator.hasNext()) {
            iterator.next().dispose();
        }

    }
}
