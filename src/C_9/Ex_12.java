package C_9;

interface CanFight {
    void fight();
}

interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}

interface CanClimb {
    void climd();
}

class Hero implements CanClimb, CanFight, CanFly, CanSwim {

    @Override
    public void fight() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void climd() {

    }
}

public class Ex_12 {
    public static void a(CanSwim x) {x.swim();}
    public static void b(CanFly x) {x.fly();}
    public static void c(CanFight x) {x.fight();}
    public static void d(CanClimb x) {x.climd();}

    public static void main(String[] args) {
        Hero hero = new Hero();
        a(hero);
        b(hero);
        c(hero);
        d(hero);
    }
}
