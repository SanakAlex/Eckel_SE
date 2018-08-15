package C_12;

public class Ex_27 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[2];
        try {
            integers[2] = 25;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
