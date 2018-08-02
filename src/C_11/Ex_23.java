package C_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ex_23 {

    public static void checkStat(Map<Integer, Integer> map) {
        int biggestKey = 0;
        int biggestValue = 0;
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if (value > biggestValue) {
                biggestValue = value;
                biggestKey = key;
            }
        }

        System.out.println(biggestKey + " appears more frequently than other: " + biggestValue);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);

            if (i % 999 == 0) {
                checkStat(m);
            }
        }
        System.out.println(m);
    }
}
