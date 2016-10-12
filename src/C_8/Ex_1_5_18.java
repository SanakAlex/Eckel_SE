package C_8;

/**
 * Created by Alex on 04.08.2016.
 */
class Cycle{
    public int wheels()
    {
        return 0;
    }
    public void riding(){
        System.out.println("riding Cycle\nwheels: "+wheels());
    }
}

class Unicycle extends Cycle{
    @Override
    public int wheels()
    {
        return 1;
    }
    public void riding(){
        System.out.println("riding Unicycle\nwheels: " + wheels());
    }
    public void balance() {
        System.out.println("Balancing unicycle");
    }
}

class Bicycle extends Cycle{
    @Override
    public int wheels()
    {
        return 2;
    }
    public void riding(){
        System.out.println("riding Bicycle\nwheels: "+wheels());
    }
    public void balance() {
        System.out.println("Balancing bicycle");
    }
}

class Tricycle extends Cycle{
    @Override
    public int wheels()
    {
        return 3;
    }
    public void riding(){
        System.out.println("riding Tricycle\nwheels: " + wheels());
    }
}

public class Ex_1_5_18 {
    public static void ride(Cycle c){
        c.riding();
    }

    public static void main(String[] args) {
        ride(new Bicycle());
        ride(new Tricycle());
        ride(new Unicycle());
        Cycle[] cycles = {
                new Bicycle(),
                new Tricycle(),
                new Unicycle()
        };
        ((Bicycle)cycles[0]).balance();
        ((Unicycle)cycles[0]).balance();
        //((Tricycle)cycles[0]).balance();

    }
}
