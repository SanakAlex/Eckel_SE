package C_5;

/**
 * Created by Sanak Alex on 26.04.2016.
 */
public class Ex_19 {
    static void f(String ... args){
        for (String s:args) System.out.printf(s+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        f("Hi", "Hello");
        f(new String[]{"hi", "Hello", "Bye"});
    }
}
