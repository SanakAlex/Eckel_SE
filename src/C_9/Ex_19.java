package C_9;

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
}

class CoinThrowerFactory implements ThrowerFactory {

    @Override
    public Thrower getThrower() {
        return new CoinThrower();
    }
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
}

class CubeThrowerFactory implements ThrowerFactory {

    @Override
    public Thrower getThrower() {
        return new CubeThrower();
    }
}

public class Ex_19 {
    public static void throwConsumer(ThrowerFactory throwerFactory) {
        System.out.println("Got value: " + throwerFactory.getThrower().throwObject());
    }
    public static void main(String[] args) {
        throwConsumer(new CoinThrowerFactory());
        throwConsumer(new CubeThrowerFactory());
    }
}
