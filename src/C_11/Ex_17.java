package C_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex_17 {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("Mat", new Gerbil(1));
        gerbilMap.put("Den", new Gerbil(2));
        gerbilMap.put("Rat", new Gerbil(3));
        gerbilMap.put("Jack", new Gerbil(4));

        Iterator<String> iterator = gerbilMap.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            gerbilMap.get(next).hop();
        }
    }
}
