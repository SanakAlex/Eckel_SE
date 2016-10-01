package C_8;

import java.util.Arrays;
import java.util.Random;

import static C_8.RandomRodentGenerator.nextRodent;
import static net.mindview.util.Print.print;

/**
 * Created by Alex on 17.09.2016.
 */
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

class Mouse extends Rodent {
    Mouse(Corn corn) {
        super(corn);
        System.out.println("Mouse()");
    }
    public String toString(){
        return "Mouse";
    }
}

class Hamster extends Rodent {
    Hamster(Corn corn) {
        super(corn);
        System.out.println("Hamster()");
    }
    public String toString(){
        return "Hamster";
    }
}

class Rat extends Rodent {
    Rat(Corn corn) {
        super(corn);
        System.out.println("Rat()");
    }
    public String toString(){
        return "Rat";
    }
}

class RandomRodentGenerator {
    private static Random random = new Random();
    static Rodent nextRodent(Corn corn){
        switch (random.nextInt(3)){
            default:
            case 0: return new Mouse(corn);
            case 1: return new Hamster(corn);
            case 2: return new Rat(corn);
        }
    }
}

public class Ex_9_12_15 {
    private static void eatingTime(Rodent rodent){
        rodent.eat(Meals.FRUIT);
    }

    private static void eatingTimeForAll(Rodent[] rodents){
        for (Rodent rodent : rodents){
            eatingTime(rodent);
        }
    }
    public static void main(String[] args) {
//        Corn corn = new Corn();
//        Rodent[] rodents = new Rodent[new Random().nextInt(10) + 1];
//        for (int i = 0; i < rodents.length; i++){
//            rodents[i] = nextRodent(corn);
//        }
//        eatingTimeForAll(rodents);

        Corn corn = new Corn();
        Corn corn2 = new Corn();
        Rodent[] rodents = new Rodent[new Random().nextInt(1) + 3];
        for (int i = 0; i < 3; i++){
            rodents[i] = nextRodent(corn);
        }
        System.out.println(Arrays.toString(rodents));
        for (Rodent r : rodents){
            r.dispose();
        }
    }
}
