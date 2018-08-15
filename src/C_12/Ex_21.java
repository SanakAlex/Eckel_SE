package C_12;

public class Ex_21 {
    private static int counter = 0;
    class ParentClass {
        private final int id = counter++;
        ParentClass() throws Exception {
            if (id == 2)
                throw new Exception("ParentException");
        }
    }

    class ChildClass extends ParentClass {
//        Compilation error
//        ChildClass(){
//            try {
//                super();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        ChildClass() throws Exception {
            super();
        }
    }
}
