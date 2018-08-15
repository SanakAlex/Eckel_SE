package C_12;

public class Ex_30 {
    class Annoyance extends Exception {}
    class Sneeze extends Annoyance {}

    public static void main(String[] args) {
        // Catch the exact type:
        try {
            throw (new Ex_30()).new Sneeze();
        } catch(Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch(Annoyance a) {
            System.out.println("Caught Annoyance");
        }
        // Catch the base type:
        try {
            throw (new Ex_30()).new Sneeze();
        } catch(Annoyance a) {
            System.out.println("Caught Annoyance");
        }
    }
}
