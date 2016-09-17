package C_4;

import java.util.Arrays;

/**
 * Created by sanak on 24.02.2016.
 */
public class Ex_24 {
    public static boolean search (int[] mass, int num){
        for (int i : mass){
            if (i==num) return true;
        }
        return false;
    }
    public static void vampireNum(){
        int[] found = new int[20];
        int k = 0;
        for (int i=10;i<100;i++) {
            if (search(found,i)) continue;
            for (int j = 10; j < 100; j++) {
                if (search(found,j)) continue;

                int result = i * j;

                char[] res1 = Integer.toString(result).toCharArray();
                Arrays.sort(res1);

                String strI = Integer.toString(i);
                String strJ = Integer.toString(j);

                char[] res2 = (strI+strJ).toCharArray();

                Arrays.sort(res2);

                if (Arrays.equals(res1,res2)){
                    found[k] = i;
                    k++;
                    found[k] = j;
                    k++;
                    System.out.println(i+" * "+j+" = "+result);
                }
            }
        }
    }

    public static void main(String[] args) {
        vampireNum();
    }
}
