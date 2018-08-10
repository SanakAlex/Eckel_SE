package C_12;

public class Ex_18_19 {
    class VeryImportantException extends Exception {
        public String toString() {
            return "A very important exception!";
        }
    }

    class HoHumException extends Exception {
        public String toString() {
            return "A trivial exception";
        }
    }

    class LostMessage {
        void f() throws VeryImportantException {
            throw new VeryImportantException();
        }
        void dispose() throws HoHumException {
            throw new HoHumException();
        }
    }
    public static void main(String[] args) {
        try {
            LostMessage lm = (new Ex_18_19()).new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } catch (HoHumException e) {
                    throw new RuntimeException();
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
