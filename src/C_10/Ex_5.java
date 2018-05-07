package C_10;

class Class {

    class SubClass {
        SubClass(String s) {
            System.out.println("Created " + s);
        }
    }
}

public class Ex_5 {
    public static void main(String[] args) {
        Class aClass = new Class();
        Class.SubClass subClass = aClass.new SubClass("LOL");
    }
}
