package C_13;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * {args: Ex_2.java "\b[Ssct]\w+" CASE_INSENSITIVE src\C_13}
 */
public class Ex_15_16 {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        int patternFlag = 0;
        switch (args[2]) {
            case "DOTALL" :
                patternFlag = Pattern.DOTALL;
                break;
            case "ANON_EQ" :
                patternFlag = Pattern.CANON_EQ;
                break;
            case "CASE_INSENSITIVE" :
                patternFlag = Pattern.CASE_INSENSITIVE;
                break;
            case "COMMENTS" :
                patternFlag = Pattern.COMMENTS;
                break;
            case "LITERAL" :
                patternFlag = Pattern.LITERAL;
                break;
            case "MULTILINE" :
                patternFlag = Pattern.MULTILINE;
                break;
            case "UNICODE_CASE" :
                patternFlag = Pattern.UNICODE_CASE;
                break;
            case "UNICODE_CHARACTER_CLASS" :
                patternFlag = Pattern.UNICODE_CHARACTER_CLASS;
                break;
            case "UNIX_LINES" :
                patternFlag = Pattern.UNIX_LINES;
                break;
        }
        Pattern p = Pattern.compile(args[1], patternFlag);



        // Iterate through the lines of the input file:
        int index = 0;
        System.out.println(p.pattern());
        Matcher m = p.matcher("");
        for(String line : new TextFile("src\\C_13\\"+args[0])) {
            m.reset(line);
            while(m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }

        System.out.println("--------------Ex_16--------------");
        System.out.println("Forth argument to process folder or file");
        if (args[3] != null) {
            String fileName = args[3];
            File file = new File(fileName);
            if (file.isDirectory()) {
                for (File fileInFolder : Objects.requireNonNull(file.listFiles())) {
                    System.out.println(fileInFolder.getPath());
                    for(String line : new TextFile(fileInFolder.getPath())) {
                        m.reset(line);
                        while(m.find())
                            System.out.println(index++ + ": " +
                                    m.group() + ": " + m.start());
                    }
                }
            } else if (file.isFile()) {
                for(String line : new TextFile(fileName)) {
                    m.reset(line);
                    while(m.find())
                        System.out.println(index++ + ": " +
                                m.group() + ": " + m.start());
                }
            }
//            System.out.println(Arrays.toString(files));
        }
    }
}
