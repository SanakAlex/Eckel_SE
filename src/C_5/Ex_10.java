package C_5;

/**
 * Created by Sanak Alex on 22.04.2016.
 */
public class Ex_10 {
    boolean status;
    Ex_10(boolean st){
        status = st;
    }
    public void finalize() {
        if (status) {
            System.out.println("I'm finalize method");
        }
    }

    public static void main(String[] args) {
        new Ex_10(true);
        System.gc();
    }
}
