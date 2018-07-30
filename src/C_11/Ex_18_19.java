package C_11;

import net.mindview.util.Countries;

import java.util.*;

public class Ex_18_19 {
    public static void main(String[] args) {
        Map<String,String> map =
                new HashMap<>(Countries.capitals(10));
        System.out.println(map);

        String[] keys = map.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        Map<String,String> m2 =
                new LinkedHashMap<>();
        for(String key : keys)
            m2.put(key, map.get(key));
        System.out.println(m2);

        Map<String,String> map1 = new TreeMap<>(map);
        System.out.println(map1);

        System.out.println("------------------------Ex_19-------------------------");

        HashSet<String> set = new HashSet<>(Countries.names(10));
        System.out.println(set);

        TreeSet<String> set2 = new TreeSet<>(set);
        System.out.println(set2);

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        String[] setValues = set.toArray(new String[0]);
        Arrays.sort(setValues);
        Collections.addAll(set1, setValues);
        System.out.println(set1);
    }
}
