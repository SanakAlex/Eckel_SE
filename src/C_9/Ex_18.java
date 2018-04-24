package C_9;

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Bicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("riding bicycle...");
    }
}

class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("riding tricycle");
    }
}

class TricycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

class Unicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("riding unicycle");
    }
}

class UnicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

public class Ex_18 {
    public static void cycleConsumer (CycleFactory cycleFactory) {
        Cycle cycle = cycleFactory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        cycleConsumer(new BicycleFactory());
        cycleConsumer(new TricycleFactory());
        cycleConsumer(new UnicycleFactory());
    }
}
