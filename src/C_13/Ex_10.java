package C_13;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_10 {
    public static void main(String[] args) {
        String s = "Java now has regular expressions";
        String[] regexs = {"^Java", "\\Breg.*",
                "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}.",
                "s{0,3}"};
        for (String regex : regexs) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            System.out.println("\nPattern: " + regex + "\n");
            while (matcher.find()) {
                System.out.println("Match \"" + matcher.group() + "\" at position " + matcher.start() + "-" + (matcher.end()-1));
            }
        }
    }
}
