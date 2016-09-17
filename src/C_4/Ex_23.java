package C_4;

/**
 * Created by sanak on 22.02.2016.
 */
public class Ex_23 {
    public static int fibonachi(int number){
        if (number<=2) {
            return 1;
        }
        return fibonachi(number-1)+fibonachi(number-2);
    }

    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            System.out.print(fibonachi(i)+" ");
        }
    }
}
