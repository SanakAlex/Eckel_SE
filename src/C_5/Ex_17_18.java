package C_5;

/**
 * Created by Sanak Alex on 26.04.2016.
 */
public class Ex_17_18 {
    Ex_17_18(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Ex_17_18[] ex_1718 = new Ex_17_18[5];
        for (Ex_17_18 ex: ex_1718){
            ex = new Ex_17_18("Hi");
        }
    }
}
