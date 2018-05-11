package C_10;

public class Ex_7_8 {

    class InsideClass {
        private int closedField;

        void changeOuterField() {
            field += 5;
            showField();
        }
    }

    private int field;

    private void showField() {
        System.out.println(field);
    }

    void callInnerClass() {
        InsideClass insideClass = new InsideClass();
        insideClass.changeOuterField();
//        find out innerField
        System.out.println("inner field value: " + insideClass.closedField);
    }

    public static void main(String[] args) {
        Ex_7_8 ex_7 = new Ex_7_8();
        ex_7.callInnerClass();
    }
}
