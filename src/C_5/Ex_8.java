package C_5;

/**
 * Created by Sanak Alex on 21.04.2016.
 */
public class Ex_8 {
    void meth_1(){
        this.meth_2();
        meth_2();
    }
    void meth_2(){
        System.out.println("It's method 2");
    }

    public static void main(String[] args) {
        new Ex_8().meth_1();
    }

}
