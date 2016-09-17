package C_3;

/**
 * Created by Alex on 08.02.2016.
 */
public class Dog {
    public String name;
    public String says;
    Dog(String name, String says){
        this.name = name;
        this.says = says;
    }
    Dog(){}

    public static void main(String[] args) {
        Dog spot = new Dog("spot", "woof");
        Dog spyke = new Dog("spyke", "guf");
        System.out.println("spot name: "+spot.name+". spot says: "+spot.says);
        System.out.println("spyke name: "+spyke.name+". spyke says: "+spyke.says);
        Dog spot_clone = new Dog();
        spot_clone = spot;
        System.out.println(spot.equals(spot_clone));
        System.out.println(spot == spot_clone);
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1==i2);
    }
}
