package C_12;

public class Ex_29 {
    class BaseballException extends RuntimeException {
    }

    class Foul extends BaseballException {
    }

    class Strike extends BaseballException {
    }

    abstract class Inning {
        public Inning()  {
        }

        public void event()  {
            // Doesn't actually have to throw anything
        }

        public abstract void atBat();

        public void walk() {
        } // Throws no checked exceptions
    }

    class StormException extends RuntimeException {
    }

    class RainedOut extends StormException {
    }

    class PopFoul extends Foul {
    }

    interface Storm {
        public void event() ;

        public void rainHard();
    }

    public class StormyInning extends Inning implements Storm {
        // OK to add new exceptions for constructors, but you
        // must deal with the base constructor exceptions:
        public StormyInning() {
        }

        public StormyInning(String s){
        }

        // Regular methods must conform to base class:
        public void walk() {
        } //Compile error

        // Interface CANNOT add exceptions to existing
        // methods from the base class:
        public void event() {
        }

        // If the method doesn't already exist in the
        // base class, the exception is OK:
        public void rainHard()  {
        }

        // You can choose to not throw any exceptions,
        // even if the base version does:
//        public void event() {}
        // Overridden methods can throw inherited exceptions:
        public void atBat()  {
        }
    }

    public static void main(String[] args) {
        StormyInning si = (new Ex_29()).new StormyInning();
        si.atBat();
        // Strike not thrown in derived version.
        Inning i = (new Ex_29()).new StormyInning();
        i.atBat();
    }
}
