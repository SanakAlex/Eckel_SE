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
        char[] ch = null;
//        String s = null;
        Object ob = null;
//        System.out.println(ch);
//        System.out.println(new Boolean(!true || true));
//        System.out.println(s);
//        System.out.println(ob);

        String s = "begin pkg_org.create_org('3','40093216','ТОВАРИСТВО З ОБМЕЖЕНОЮ ВІДПОВІДАЛЬНІСТЮ \"СМД ЮА\"','Test Test Test ','123test123','2001163@ukr.net','null','+380671839074','o.sanak'); end;\n";
        s = s.replaceAll("'null'", "null");
        System.out.println(s);

        String sql = "select\n" +
                "  P.ID, P.SURNAME||' '||P.NAME||' '||P.MIDDLENAME per, CONF.COINCIDE\n" +
                "from tsk t\n" +
                "  join bp on BP.ID=T.BP_ID\n" +
                "  join person p on P.ORG_ID=BP.ORG_ID\n" +
                "  join CONFIG_ARM conf on CONF.APP_ID='arms'\n" +
                "where p.TYPE_PERSON_ID in (1,2) and \n" +
                "T.ID=";

        System.out.println(sql);


        System.out.println(Boolean.valueOf("true"));


        int o = 1;


        System.out.println(o + "  asdasd    " + ++o);
    }
}
