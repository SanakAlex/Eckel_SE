package C_13;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * {args: src\C_13\Ex_19.java}
 */
public class Ex_19 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.exit(0);
        }
        String fileName = args[0];
        Pattern pattern = Pattern.compile("(\\b\\p{Upper}\\w*\\b )");
        Matcher matcher = pattern.matcher("");
        int index = 0;
        String text = TextFile.read(fileName);
        text = text.replaceAll(Ex_17.ALL_COMMENTS_REGEX, "");
        text = text.replaceAll(Ex_18.ALL_STRINGS_REGEX, "");
        for (String line : text.split("\n")) {
            matcher.reset(line);
            while (matcher.find()) {
                System.out.println(++index + ": '" + matcher.group() + "' class at: " + matcher.start());
            }
        }
    }
}
