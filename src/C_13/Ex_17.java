package C_13;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * {args: src\C_13\Ex_17.java}
 */
public class Ex_17 {

    public static final String ALL_COMMENTS_REGEX = "(^\\s*//.*?$)|(/\\*.*?\\*/)";

    public static void main(String[] args) {
        if (args.length < 1) {
            System.exit(0);
        }

        //test comment
        /* hello */
//ergerg
        String fileName = args[0];
        Pattern pattern = Pattern.compile(ALL_COMMENTS_REGEX, Pattern.DOTALL);
        Matcher matcher = pattern.matcher("");
        int index = 0;
        for (String line : new TextFile(fileName)) {
            matcher.reset(line);
            while (matcher.find()) {
                System.out.println(++index + ": '" + matcher.group() + "' start at: " + matcher.start());
            }
        }
    }
}
