package C_11;

import net.mindview.util.RandomGenerator;
import net.mindview.util.TextFile;

import java.util.*;
import java.util.stream.Collectors;

public class Ex_22 {

    static class StringCounter {

        public static final Comparator<StringCounter> STRING_COUNTER_COMPARATOR =
                new Comparator<StringCounter>() {
                    @Override
                    public int compare(StringCounter o1, StringCounter o2) {
                        return o1.word.compareToIgnoreCase(o2.word);
                    }
                };

        private String word;

        private Integer counter;

        StringCounter(String word) {
            this.word = word;
            this.counter = 1;
        }

        public Integer getCounter() {
            return counter;
        }

        public void setCounter(Integer counter) {
            this.counter = counter;
        }

        String getWord() {
            return word;
        }

        void setWord(String word) {
            this.word = word;
        }

        void increaseCounter() {
            counter++;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof StringCounter
                    && this.word.equals(((StringCounter) obj).word);
        }

        @Override
        public int hashCode() {
            return word.hashCode();
        }

        @Override
        public String toString() {
            return word + ": " + counter;
        }
    }

    public static void findAndIncrStringCounter(Iterator<StringCounter> iterator, String wordToSearch) {
        while (iterator.hasNext()) {
            StringCounter stringCounter = iterator.next();
            if (stringCounter.getWord().equals(wordToSearch)) {
                stringCounter.increaseCounter();
            }
        }
    }

    public static void main(String[] args) {
        Set<StringCounter> set = new HashSet<>();
        List<String> allWords = new LinkedList<>(new TextFile("src\\net\\mindview\\SetOperations.java", "\\W+"));

        for (String word : allWords) {
            if (!set.contains(new StringCounter((word)))) {
                StringCounter stringCounter = new StringCounter(word);
                set.add(stringCounter);
            } else {
                findAndIncrStringCounter(set.iterator(), word);
            }
        }
        int mainCounter = 0;
        for (StringCounter stringCounter : set) {
            mainCounter += stringCounter.counter;
        }
        ArrayList<StringCounter> list = new ArrayList<>(set);
        list.sort(StringCounter.STRING_COUNTER_COMPARATOR);
        System.out.println(list);
        System.out.println(mainCounter);
    }
}
