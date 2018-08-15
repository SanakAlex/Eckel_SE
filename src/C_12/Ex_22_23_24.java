package C_12;

public class Ex_22_23_24 {
    class ClassWithDisposeMethod {
        public void dispose() {
            System.out.println("Disposed");
        }
    }

    class FailingConstructor {
        private ClassWithDisposeMethod disposeMethod, disposeMethod2;

        FailingConstructor(boolean throwException) throws Exception {
            disposeMethod = new ClassWithDisposeMethod();
            if (throwException) {
                try {
                    throw new Exception("exception");
                } finally {
                    disposeMethod.dispose();
                }
            }
            try {
                disposeMethod2 = new ClassWithDisposeMethod();
            } catch (Exception e) {
                disposeMethod.dispose();
                e.printStackTrace();
            }
        }
        public void dispose() {
            disposeMethod2.dispose();
            disposeMethod.dispose();
            System.out.println("Disposing FailingConstructor");
        }
    }

    public static void main(String[] args) {
        boolean state = false;
        for (int i=0; i<2; i++, state = !state) {
            try {
                FailingConstructor failingConstructor = (new Ex_22_23_24()).new FailingConstructor(state);
                try {
                    System.out.println("Processing");
                } finally {
                    failingConstructor.dispose();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
