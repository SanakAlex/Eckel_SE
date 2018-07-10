package C_10;

public class Ex_15 {

    public Ex_15(int argument) {
        System.out.println(argument);
    }

    public static void main(String[] args) {
        Ex_15_Anon ex_15_anon = new Ex_15_Anon();
        Ex_15 ex_15 = ex_15_anon.getEx_15();
    }
}

class Ex_15_Anon {
    Ex_15 getEx_15() {
        return new Ex_15(22) {
            {
                System.out.println("Hi");
            }
        };
    }
}