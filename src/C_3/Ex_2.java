package C_3;

/**
 * Created by Alex on 30.11.2015.
 */
public class Ex_2 {
    public float fl;
    Ex_2 (float fl){this.fl = fl;}
    public static void main(String... args) {
        Ex_2 first = new Ex_2(5);
        Ex_2 second = new Ex_2(44);
        first = second;
        first.fl = 44;
        System.out.println("first: " + first.fl + " second: " + second.fl);

    }
}
