package C_11;

import net.mindview.util.TextFile;

import java.util.*;

public class Ex_25_26 {

    public static void main(String[] args) {
        List<String> allWords = new ArrayList<>(new TextFile("src\\net\\mindview\\SetOperations.java", "\\W+"));
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < allWords.size(); i++) {
            String word = allWords.get(i);
            ArrayList<Integer> integers = map.get(word);
            if (integers == null) {
                integers = new ArrayList<>();
                map.put(word, integers);
            }
            integers.add(i);
        }
        System.out.println(map);

        System.out.println("--------------Ex_26----------");
        TreeMap<Integer, String> strings = new TreeMap<>();
        for (String s : map.keySet()) {
            ArrayList<Integer> integers = map.get(s);
            for (Integer integer : integers) {
                strings.put(integer, s);
            }
        }

        System.out.println(strings.values());
        System.out.println(new ArrayList<>(strings.values()).equals(allWords));
    }
}
