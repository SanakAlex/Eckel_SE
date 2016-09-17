package C_5;

/**
 * Created by Sanak Alex on 25.04.2016.
 */
public class Ex_14 {
    static String str1 = "str1";
    static String str2;
    static {
        str2 = "str2";
    }
    static void method(){
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
    }

    public static void main(String[] args) {
        method();
    }
}
