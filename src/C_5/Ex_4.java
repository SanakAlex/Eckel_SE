package C_5;

/**
 * Created by Sanak Alex on 01.04.2016.
 */
public class Ex_4 {
    Ex_4(){
        System.out.println("Hello!");
    }
    Ex_4(String message){
        System.out.println(message);
        new Ex_4();
    }

    public static void main(String[] args) {
        new Ex_4("Privet");
    }
}

