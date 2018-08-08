package C_12;

public class Ex_5 {

    public static void main(String[] args) {
        int counter = 6;

        while (true) {
            try {
                if (--counter > 1) {
                    throw new Exception("Exception");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
            System.out.println("Finally overcome exception");
            break;
        }

        System.out.println("End of while");
    }
}
