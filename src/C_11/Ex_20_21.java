package C_11;

import net.mindview.util.TextFile;

import java.util.*;

public class Ex_20_21 {
    private final static Set<Character> vowels =
            new HashSet<Character>(Arrays.asList('a', 'e', 'o', 'u',
                    'i', 'A', 'E', 'O', 'U', 'I'));

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        Set<String> words = new TreeSet<>(new TextFile("src\\net\\mindview\\SetOperations.java", "\\W+"));
        System.out.println(words);

        for (String word : words) {
            for (Character letter : word.toCharArray()) {
                if (vowels.contains(letter)) {
                    Integer frequency = map.get(letter);
                    map.put(letter, frequency == null ? 1 : frequency + 1);
                }
            }
        }

        System.out.println(map);

        System.out.println("-------------Ex_21---------------");

        HashMap<String, Integer> map1 = new HashMap<>();
        List<String> allWords = new LinkedList<>(new TextFile("src\\net\\mindview\\SetOperations.java", "\\W+"));

        for (String word : allWords) {
            Integer integer = map1.get(word);
            map1.put(word, integer == null ? 1 : integer + 1);
        }

        System.out.println(map1);
        List<String> keySet = new ArrayList<>(map1.keySet());
        keySet.sort(String.CASE_INSENSITIVE_ORDER);
        for (String s : keySet) {
            System.out.println(s + ": " + map1.get(s));
        }
    }
}
