package C_3;

/**
 * Created by sanak on 19.02.2016.
 */
public class Ex_14 {
    public static void stringCompare (String s1, String s2){
        System.out.println("first: "+s1+" second: "+s2);
        System.out.println("==: "+(s1 == s2));
        System.out.println("!=: "+(s1 != s2));
        System.out.println("equals: "+s1.equals(s2));
    }

    public static void main(String[] args) {
        stringCompare("he", "hello");
    }
}
