package C_4;

/**
 * Created by sanak on 21.02.2016.
 */
public class Ex_19 {
    public static void intToBinaryString(int a){
        char[] buffer = new char[32];
        int bufferPosition = 32;
        do{
            buffer[--bufferPosition] = ((a & 0x01) != 0) ? '1':'0';
            a>>>=1;
        } while (a!=0);
        for (int i=bufferPosition;i<32;i++){
            System.out.print(buffer[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        intToBinaryString(52);
        System.out.println(Integer.toBinaryString(52));
    }
}
