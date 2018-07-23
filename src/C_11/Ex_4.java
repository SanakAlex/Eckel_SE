package C_11;

import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

class FilmNameGenerator {
    private static String[] characters = {
            "Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy",
            "Bashful", "Snow White", "Witch Queen", "Prince"
    };
    private static int next = 0;
    public static String generateFilmName() {
        if (next != characters.length)
            return characters[next++];
        else {
            next = 0;
            return generateFilmName();
        }
    }
}

public class Ex_4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(FilmNameGenerator.generateFilmName());
            linkedList.add(FilmNameGenerator.generateFilmName());
            hashSet.add(FilmNameGenerator.generateFilmName());
            linkedHashSet.add(FilmNameGenerator.generateFilmName());
        }

        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
    }
}
