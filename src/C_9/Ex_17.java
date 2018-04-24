package C_9;

interface CheckFieldI {
    int VAR = 123;
}

class CheckFieldImpl implements CheckFieldI {
    CheckFieldImpl() {
        System.out.println("created");
    }
}

public class Ex_17 implements CheckFieldI {
    //    VAR++;
    public static void main(String[] args) {
//!    VAR++;
        System.out.println(CheckFieldImpl.VAR);
        CheckFieldI object = new CheckFieldImpl();
        System.out.println(CheckFieldI.VAR);
    }
}
