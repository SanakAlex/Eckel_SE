package C_4;

/**
 * Created by sanak on 21.02.2016.
 */
public class Ex_18 {
    public static void primeSearch(int bound){
        for (int i=1;i<=bound;i++){
            boolean prime = true;
            for (int j=2;j<i;j++){
               if (i%j==0) prime = false;
            }
            if (prime) System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        primeSearch(100);
    }
}
