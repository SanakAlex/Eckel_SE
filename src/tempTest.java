import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

class User {
    private String firstName;
    private String lastName;
}
public class tempTest {


    public static void main(String[] args) throws ParseException {
        Timestamp d = new Timestamp(System.currentTimeMillis());
        Date test = new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("09-02-2017 22:00");
        System.out.println(d);
        System.out.println(test);
        System.out.println(d.getDate()==test.getDate() && d.getYear()==test.getYear() && d.getMonth()==test.getMonth());
    }
}
