package C_11;

import net.mindview.util.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex_16 {
    private final static Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'U', 'I'));

    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(new TextFile("src\\net\\mindview\\holding\\SetOperations.java", "\\W+"));
        System.out.println(words);

        int wholeFileCharCounter = 0;
        int wordCharCounter = 0;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (vowels.contains(c)) {
                    wholeFileCharCounter++;
                    wordCharCounter++;
                }
            }
            System.out.println("num of vovwels in word " + word + ": " + wordCharCounter);
            wordCharCounter = 0;
        }
        System.out.println("\nnum of all vovwels in file: " + wholeFileCharCounter);
    }
}
