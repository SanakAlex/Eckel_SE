package C_8;

/**
 * Created by Alex on 12.10.2016.
 */
class Status {
    public void printStatus() {}
}

class AlertStatus extends Status {
    public void printStatus() {
        System.out.println("Alert status");
    }
}
class CalmStatus extends Status {
    public void printStatus() {
        System.out.println("Calm status");
    }
}
class MiddleStatus extends Status {
    public void printStatus() {
        System.out.println("Middle status");
    }
}

class Starship {
    private Status status = new CalmStatus();
    public void keepCalmStatus() {
        status = new CalmStatus();
    }
    public void keepAlertStatus() {
        status = new AlertStatus();
    }
    public void keepMiddleStatus() {
        status = new MiddleStatus();
    }
    public void printStatusOfShip() {
        status.printStatus();
    }
}
public class Ex_17 {
    public static void main(String[] args) {
        Starship ship = new Starship();
        ship.printStatusOfShip();
        ship.keepAlertStatus();
        ship.printStatusOfShip();
        ship.keepMiddleStatus();
        ship.printStatusOfShip();
    }
}
