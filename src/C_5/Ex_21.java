package C_5;

/**
 * Created by Sanak Alex on 26.04.2016.
 */
public class Ex_21 {
    enum Money{
        USD, EUR, HRN, LB, RUB
    }
    static void print(){
        for (Money m:Money.values()){
            System.out.println(m+", ordinal: "+(m.ordinal()+1));
        }
    }

    public static void main(String[] args) {
        print();
    }
}
