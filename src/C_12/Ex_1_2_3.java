package C_12;

public class Ex_1_2_3 {
    public static void main(String[] args) {
        try {
            throw new Exception("Here is exception thrown");
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block message");
        }

        System.out.println("-------------Ex_2-----------------");

        Object o = null;
        try {
            System.out.println(o.hashCode());
        } catch (NullPointerException e) {
            e.printStackTrace(System.out);
        }

        System.out.println("--------------Ex_3-----------------");

        Integer[] integers = new Integer[2];
        try {
            integers[2] = 25;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.out);
        }
    }
}
