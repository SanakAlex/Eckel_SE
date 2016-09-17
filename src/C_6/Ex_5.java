package C_6;

/**
 * Created by Sanak Alex on 01.05.2016.
 */
public class Ex_5 {
    private String priv = "private";
    protected String prot = "protected";
    public String publ = "public";
    String pack = "package access";
    public void printPublic(){
        System.out.println(this.publ);
    }
    protected void printProtected(){
        System.out.println(this.prot);
    }
    private void printPrivate(){
        System.out.println(this.priv);
    }
    void printPackage(){
        System.out.println(this.pack);
    }

    public static void main(String[] args) {
        Ex_5 ex5 = new Ex_5();
        ex5.printPackage();
        ex5.printPrivate();
        ex5.printProtected();
        ex5.printPublic();
    }
}
