package C_7;

/**
 * Created by Sanak Alex on 02.05.2016.
 */
public class Ex_1 {
    public static void main(String[] args) {
        Simple2 s2 = new Simple2();
        System.out.println(s2);
    }
}
class Simple1 {
    private String s;
    Simple1(){
        System.out.println("Simple1 init");
        s = "Done";
    }
    public String toString(){
        return s;
    }
}
class Simple2 {
    private Simple1 obj;
    private String s2;
    public String toString(){
        if (obj==null){
            obj = new Simple1();
            s2 = "init s2\n";
        }
        return  "s2: "+s2+
                "obj: "+obj;
    }
}