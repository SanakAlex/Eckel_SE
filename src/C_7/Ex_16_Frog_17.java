package C_7;

/**
 * Created by Sanak Alex on 20.05.2016.
 */
public class Ex_16_Frog_17 extends Ex_16_Amphibian {
    protected void hi(){
        System.out.println("Hello frog");
    }
    public static void main(String[] args) {
        Ex_16_Amphibian ex_16_amphibian = new Ex_16_Frog_17();
        ex_16_amphibian.hi();
    }
}
