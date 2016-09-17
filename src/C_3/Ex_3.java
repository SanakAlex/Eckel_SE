package C_3;

/**
 * Created by Alex on 31.01.2016.
 */
public class Ex_3 {
    public float fl;
    Ex_3 (float fl){this.fl = fl;}
    public static void changeFl(Ex_3 ex){
        ex.fl = 5;
    }
    public static void main(String... args) {
        Ex_3 ex3 = new Ex_3(85);
        changeFl(ex3);
        System.out.println("first: "+ex3.fl);
    }
}
