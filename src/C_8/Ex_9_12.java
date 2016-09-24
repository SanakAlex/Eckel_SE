package C_8;

import java.util.Random;

import static C_8.RandomRodentGenerator.nextRodent;

/**
 * Created by Alex on 17.09.2016.
 */
enum Meals {
    MEAT, FRUIT, NUT, GRASS
}

class Rodent {
    Rodent() {
        System.out.println("Rodent()");
    }
    void eat(Meals meals){
        System.out.println(this + " eats " + meals);
    }
    public String toString(){
        return "Rodent";
    }
}

class Mouse extends Rodent {
    Mouse() {
        System.out.println("Mouse()");
    }
    public String toString(){
        return "Mouse";
    }
}

class Hamster extends Rodent {
    Hamster() {
        System.out.println("Hamster()");
    }
    public String toString(){
        return "Hamster";
    }
}

class Rat extends Rodent {
    Rat() {
        System.out.println("Rat()");
    }
    public String toString(){
        return "Rat";
    }
}

class Zoo {
    Rodent rot;
    Mouse mouse;
    Hamster hamster;
    Rat rat;
    Zoo(){
        Rodent rot = new Rodent();
        Mouse mouse = new Mouse();
        Hamster hamster = new Hamster();
        Rat rat = new Rat();
    }
}

class RandomRodentGenerator {
    private static Random random = new Random();
    static Rodent nextRodent(){
        switch (random.nextInt(3)){
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
            case 2: return new Rat();
        }
    }
}

public class Ex_9_12 {
    private static void eatingTime(Rodent rodent){
        rodent.eat(Meals.FRUIT);
    }

    private static void eatingTimeForAll(Rodent[] rodents){
        for (Rodent rodent : rodents){
            eatingTime(rodent);
        }
    }
    public static void main(String[] args) {
//        Rodent[] rodents = new Rodent[new Random().nextInt(10) + 1];
//        for (int i = 0; i < rodents.length; i++){
//            rodents[i] = nextRodent();
//        }
//        eatingTimeForAll(rodents);

        Zoo zoo = new Zoo();
    }
}
