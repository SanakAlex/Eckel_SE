package C_7;

/**
 * Created by Sanak Alex on 20.05.2016.
 */
public class Ex_14 {
    static class Engine {
        public void start() {}
        public void rev() {}
        public void stop() {}
        public void service() {}
    }

    static class Wheel {
        public void inflate(int psi) {}
    }

    static class Window {
        public void rollup() {}
        public void rolldown() {}
    }

    static class Door {
        public Window window = new Window();
        public void open() {}
        public void close() {}
    }

    public static class Car {
        public Engine engine = new Engine();
        public Wheel[] wheel = new Wheel[4];
        public Door
                left = new Door(),
                right = new Door(); // 2-door

        public Car() {
            for (int i = 0; i < 4; i++)
                wheel[i] = new Wheel();
        }
    }
    public static void main(String[] args) {
        Car car = new Ex_14.Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }
}
