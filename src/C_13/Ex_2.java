package C_13;

import java.util.ArrayList;
import java.util.List;

public class Ex_2 {
    class InfiniteRecursion {
        public String toString() {
            return " InfiniteRecursion address: " + super.toString() + "\n";
        }
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v =
                new ArrayList<>();
        for(int i = 0; i < 10; i++)
            v.add((new Ex_2()).new InfiniteRecursion());
        System.out.println(v);
    }
}
