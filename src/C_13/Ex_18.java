package C_13;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * {args: src\C_13\Ex_18.java}
 */
public class Ex_18 {

    public static final String ALL_STRINGS_REGEX = "\"([^\"]|\\\\\")*[^\\\\]\"";

    public static void main(String[] args) {
        if (args.length < 1) {
            System.exit(0);
        }

        //test comment
        /* hello */
//ergerg
        String hello = "it's a trap";
        String stringWIthQuotes= "it's a \"trap\"";

        String fileName = args[0];
        Pattern pattern = Pattern.compile(ALL_STRINGS_REGEX);
        Matcher matcher = pattern.matcher("");
        int index = 0;
        for (String line : new TextFile(fileName)) {
            matcher.reset(line);
            while (matcher.find()) {
                System.out.println(++index + ": '" + matcher.group() + "' string at: " + matcher.start());
            }
        }
    }
}
