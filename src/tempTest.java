import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class tempTest {

    public static void main(String[] args) throws ParseException {
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // OK -- modify an element
//        list.add(21);
        String sql =
                "select id, nickname from creator.contragent \n" +
                        " where id=(select max(id) from creator.contragent where contragenttypeid='" +
                        "'  and identifycode='" + "')";
        System.out.println(sql
        );
    }
}
