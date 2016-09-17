package C_2;


/**
 * Created by Alex on 23.11.2015.
 */
public class Main {
    public static int i;
    public static char c;

     public static int storage (String s){
        return s.length()*2;
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(storage(str));
        ATypeName a = new ATypeName(0);
        DataOnly Data = new DataOnly(11,2,true);
        System.out.println(Data.b);
        System.out.println(a+"212");
        System.out.println("this is char:"+c);
        System.out.println("Привет, Мир!");
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        st1.stat++;
        st2.stat++;
        Incrementable.increment();
        System.out.println(StaticTest.stat);
        Integer inte = 5;
        int h = inte;


    }
}
