package C_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_11 {
    public static void main(String[] args) {

        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        String input = "Arline ate eight apples and one orange while Anita hadn’t any";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group(2));
            System.out.println("Match \"" + matcher.group() + "\" at position " + matcher.start() + "-" + (matcher.end()-1));
        }


    }
}
