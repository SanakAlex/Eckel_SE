import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyException extends Exception {
    private static Logger logger = Logger.getLogger("MyException");

    public MyException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class tempTest {
//    Throwable

    public static void main(String[] args) throws ParseException, MyException {
        /*List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // OK -- modify an element
//        list.add(21);
        String sql =
                "select id, nickname from creator.contragent \n" +
                        " where id=(select max(id) from creator.contragent where contragenttypeid='" +
                        "'  and identifycode='" + "')";
        System.out.println(sql);*/

//        throw new MyException();
        /*long time = System.nanoTime();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += i;
        }
        long l = System.nanoTime() - time;
        System.out.println("Time: " + l);

        time = System.nanoTime();
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            strB.append(i);
        }
        l = System.nanoTime() - time;
        System.out.println("Time: " + l);*/

        /*char c1 = 064770;
        System.out.println(c1);
        char c3 = 0xbeef;
        char c6 = '\uface';
        System.out.println(c6);*/

//        Pattern p = Pattern.compile("(?m)(^A\\w*\\b)", 0);
//
//        Matcher matcher = p.matcher("Asta lavista babe\nHello\nA dog has a nose");
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

        String s = "src\\C_13";
        File f = new File(s);
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
