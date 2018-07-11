package C_10;

interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("riding bicycle");
    }

    public static CycleFactory factory =
            new CycleFactory() {
                @Override
                public Cycle getCycle() {
                    return new Bicycle();
                }
            };
}

class Tricycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("tricycle");
    }

    public static CycleFactory factory =
            new CycleFactory() {
                @Override
                public Cycle getCycle() {
                    return new Tricycle();
                }
            };
}

public class Ex_16 {

    public static void playGame(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        playGame(Bicycle.factory);
        playGame(Tricycle.factory);
    }
}
