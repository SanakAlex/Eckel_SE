package C_5;

import java.util.Random;

/**
 * Created by Sanak Alex on 26.04.2016.
 */
public class Ex_16 {
    public static void main(String[] args) {
        String[] strings = new String[new Random().nextInt(20)];
        strings[0] = "1";
        for (int i=1;i<strings.length;i++) {
            strings[i] = strings[i-1]+"1";
        }
        for (String s:strings) System.out.println(s);
    }
}
