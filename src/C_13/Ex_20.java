package C_13;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Locale;
import java.util.Scanner;

public class Ex_20 {
    public static BufferedReader input = new BufferedReader(new StringReader("1 10000000000000 1.1 1e55 Howdy Hi"));

    double aDouble;
    int anInt;
    String string = "";
    long aLong;
    float aFloat;

    @Override
    public String toString() {
        return "\nd: " + aDouble + "\ni: " + anInt + "\ns: " + string + "\nl: " + aLong + "\nf: " + aFloat;
    }

    Ex_20(Scanner scanner) {
        scanner.useLocale(Locale.US);
        anInt = scanner.nextInt();
        aLong = scanner.nextLong();
        aFloat = scanner.nextFloat();
        aDouble = scanner.nextDouble();
        string = scanner.next("\\w+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(input);


        System.out.println(new Ex_20(scanner));

    }
}
