import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

class MyException extends Exception {
    private static Logger logger = Logger.getLogger("MyException");

    public MyException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class tempTest {



    public static void main(String[] args) throws ParseException, MyException {
        /*List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // OK -- modify an element
//        list.add(21);
        String sql =
                "select id, nickname from creator.contragent \n" +
                        " where id=(select max(id) from creator.contragent where contragenttypeid='" +
                        "'  and identifycode='" + "')";
        System.out.println(sql);*/

        throw new MyException();
    }
}
