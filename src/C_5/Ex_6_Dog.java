package C_5;

/**
 * Created by Sanak Alex on 15.04.2016.
 */
public class Ex_6_Dog {
    public static void bark(int i, char c){
        System.out.println("Лай");
    }

    public static void bark(char c, int i){
        System.out.println("Вой");
    }

    public static void bark(boolean a){
        System.out.println("Поскуливание");
    }

    public static void main(String[] args) {
        bark(1, 'd');
        bark('a',1);
        bark(true);
    }
}
