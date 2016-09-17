package C_3;

/**
 * Created by Alex on 31.01.2016.
 */
public class Ex_4 {
    public static float time;
    public static float length;
    public static float speed;
    public static void speedCalc(float time, float length){
        speed = length/time;
    }
    public static void main(String[] args) {
        Ex_4 ex4 = new Ex_4();
        time=5;
        length=859;
        speedCalc(time,length);
        System.out.println(ex4.speed);
    }
}
