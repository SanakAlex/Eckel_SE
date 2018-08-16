package C_14;

import static net.mindview.util.Print.print;

public class Ex_1_2 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    interface HasBatteries {}
    interface Waterproof {}
    interface Shoots {}

    /**
     * Ex_2 interface
     */
    interface CreatesSound {}

    static class Toy {
// Comment out the following default constructor
// to see NoSuchMethodError from (*1*)
//        if comment default constructor, then class.newInstance() won't find default constructor for this class
        Toy() {}
        Toy(int i) {}
    }
    static class FancyToy extends Toy
            implements HasBatteries, Waterproof, Shoots, CreatesSound {
        FancyToy() { super(1); }
    }

    static void printInfo(Class cc) {
        print(ANSI_BLUE + "Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]" + ANSI_RESET);
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("C_14.Ex_1_2$FancyToy");
        } catch(ClassNotFoundException e) {
            print("Can’t find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
// Requires default constructor:
            obj = up.newInstance();
        } catch(InstantiationException e) {
            print("Cannot instantiate");
            System.exit(1);
        } catch(IllegalAccessException e) {
            print("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
