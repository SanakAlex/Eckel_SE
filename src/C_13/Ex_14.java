package C_13;

import java.util.Arrays;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

public class Ex_14 {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
//        print(Arrays.toString(
//                Pattern.compile("!!").split(input)));
        // Only do the first three:
//        print(Arrays.toString(
//                Pattern.compile("!!").split(input, 3)));
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!", 3)));
    }
}
