package C_5;

/**
 * Created by Sanak Alex on 26.04.2016.
 */
public class Ex_20 {
    public static void main(String... args) {
        for (Object obj:args) System.out.println(obj);
    }
    static class Main{
        public static void main(String[] args) {
            Ex_20.main("Hello","I'm Alex");
        }
    }
}
