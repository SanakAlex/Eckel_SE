package C_11;

import net.mindview.util.Countries;

import java.util.LinkedHashMap;
import java.util.TreeSet;

public class Ex_24 {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>(Countries.capitals(25));
        System.out.println(map);

        TreeSet<String> keySet = new TreeSet<>(map.keySet());
        for (String s : keySet) {
            String value = map.get(s);
            map.remove(s);
            map.put(s, value);
        }
        System.out.println(map);
    }
}
