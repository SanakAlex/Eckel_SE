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

public class Ex_1_5 {
    public static void ride(Cycle c){
        c.riding();
    }

    public static void main(String[] args) {
        ride(new Bicycle());
        ride(new Tricycle());
        ride(new Unicycle());
    }
}
