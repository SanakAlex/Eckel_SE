package C_10;

import java.util.Random;

interface Thrower {
    Random RANDOM = new Random();
    int throwObject();
}

interface ThrowerFactory {
    Thrower getThrower();
}

abstract class ThrowingObject {
    int facet;
}

class CoinThrower extends ThrowingObject implements Thrower {

    CoinThrower() {
        facet = 2;
    }

    @Override
    public int throwObject() {
        System.out.println("Throwing a coin");
        return RANDOM.nextInt(facet);
    }

    public static ThrowerFactory factory =
            new ThrowerFactory() {
                @Override
                public Thrower getThrower() {
                    return new CoinThrower();
                }
            };
}

class CubeThrower extends ThrowingObject implements Thrower {

    CubeThrower() {
        facet = 6;
    }

    @Override
    public int throwObject() {
        System.out.println("Throwing a cube");
        return RANDOM.nextInt(facet);
    }

    public static ThrowerFactory factory =
            new ThrowerFactory() {
                @Override
                public Thrower getThrower() {
                    return new CubeThrower();
                }
            };
}

public class Ex_17 {
    public static void throughtObject(ThrowerFactory factory) {
        Thrower thrower = factory.getThrower();
        System.out.println(thrower.throwObject());
    }

    public static void main(String[] args) {
        throughtObject(CoinThrower.factory);
        throughtObject(CubeThrower.factory);
    }
}
