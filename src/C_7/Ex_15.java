package C_7;

/**
 * Created by Sanak Alex on 20.05.2016.
 */
public class Ex_15 {
    private String s="private String";
    protected void showS(){
        System.out.println(s);
    }
}
class Ex_15_2 extends Ex_15{
    public void showProtected(){
        System.out.println("new method");
        showS();
    }
    public static void main(String[] args) {
        Ex_15_2 e = new Ex_15_2();
        e.showProtected();
    }
}
