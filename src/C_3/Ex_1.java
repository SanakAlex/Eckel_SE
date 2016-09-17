package C_3;
import java.util.Date;
/**
 * Created by Alex on 26.11.2015.
 */
public class Ex_1 {
    public static void main(String[] args) {
        System.out.println("OLOL");
        System.out.println(new Date());
        Ex_2 ex1 = new Ex_2(5.8f);
        Ex_2 ex2 = new Ex_2(66f);
        ex1 = ex2;
        System.out.println(ex1.fl);
        System.out.println(ex2.fl);
    }
}
