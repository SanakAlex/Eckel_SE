package C_4;

import static net.mindview.util.Print.print;

/**
 * Created by sanak on 22.02.2016.
 */
public class Ex_20 {
    static int test(int testval, int target, int begin, int end) {
        if (testval < end && testval > begin) print("testval is between "+begin+" and "+end);
        else print("testval is out of bounds");
        if(testval > target)
            return +1;
        else if(testval < target)
            return -1;
        else
            return 0;
            }
    public static void main(String[] args) {
        print(test(10, 5, 1, 99));
        print(test(5, 10, 78, 79));
        print(test(5, 5, 45, 50));
    }
}
