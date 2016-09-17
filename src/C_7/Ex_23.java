package C_7;

/**
 * Created by Alex on 02.08.2016.
 */
public class Ex_23 {
    public static int x = getX();
    private static int getX(){
        System.out.println("x init");
        return 1;
    }
    Ex_23(){
        System.out.println("Ex_23");
    }

    public static void main(String[] args) {
        //x = 44; it works too
        new Ex_23();
    }
}
