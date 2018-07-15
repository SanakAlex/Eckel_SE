package C_10;

public class Ex_19 {

    public static class My1Class {
        My1Class() {
            System.out.println("My1Class");
        }

        public static class My2Class {
            My2Class() {
                System.out.println("My2Class");
            }
        }
    }

    public static void main(String[] args) {
        Ex_19 ex_19 = new Ex_19();
        Ex_19.My1Class my1Class = new My1Class();
        Ex_19.My1Class.My2Class my2Class = new My1Class.My2Class();
    }
}
