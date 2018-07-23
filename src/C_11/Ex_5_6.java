package C_11;

import java.util.*;

import static net.mindview.util.Print.print;

public class Ex_5_6 {
    private static Random rand = new Random(49);

    static List<Integer> createList(int size) {
        Integer[] integers = new Integer[size];
        for (int i = 0; i < size; i++) {
            integers[i] = rand.nextInt();
        }
        List<Integer> integers1 = new ArrayList<>();
        Collections.addAll(integers1,integers);
        return integers1;
    }

    static List<String> createListOfChars(int size) {
        List<String> integers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            integers.add(String.valueOf((char) (rand.nextInt(26)+97)));
        }
        return integers;
    }

    public static void main(String[] args) {
        System.out.println("Ex_5");
        List<Integer> integers = createList(7);
        print("1: " + integers);
        Integer h = 125;
        integers.add(h); // Automatically resizes
        print("2: " + integers);
        print("3: " + integers.contains(h));
        integers.remove(h); // Remove by object
        Integer p = integers.get(2);
        print("4: " + p + " " + integers.indexOf(p));
        Integer cymric = 105;
        print("5: " + integers.indexOf(cymric));
        print("6: " + integers.remove(cymric));
// Must be the exact object:
        print("7: " + integers.remove(p));
        print("8: " + integers);
        integers.add(3,99); // Insert at an index
        print("9: " + integers);
        List<Integer> sub = integers.subList(1, 4);
        print("subList: " + sub);
        print("10: " + integers.containsAll(sub));
        Collections.sort(sub); // In-place sort
        print("sorted subList: " + sub);
// Order is not important in containsAll():
        print("11: " + integers.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        print("shuffled subList: " + sub);
        print("12: " + integers.containsAll(sub));
        List<Integer> copy = new ArrayList<>(integers);
        sub = Arrays.asList(integers.get(1), integers.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<>(integers); // Get a fresh copy
        copy.remove(2); // Remove by index
        print("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        print("15: " + copy);
        copy.set(1, 78); // Replace an element
        print("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        print("17: " + copy);
        print("18: " + integers.isEmpty());
        integers.clear(); // Remove all elements
        print("19: " + integers);
        print("20: " + integers.isEmpty());
        integers.addAll(createList(4));
        print("21: " + integers);
        Object[] o = integers.toArray();
        print("22: " + o[3]);
        Integer[] pa = integers.toArray(new Integer[0]);
        print("23: " + pa[3].getClass().getName());

        System.out.println("---------------------Ex_6------------");

        List<String> strings = createListOfChars(7);
        print("1: " + strings);
        String s = String.valueOf((char) 102);
        strings.add(s); // Automatically resizes
        print("2: " + strings);
        print("3: " + strings.contains(s));
        strings.remove(s); // Remove by object
        String pString = strings.get(2);
        print("4: " + pString + " " + strings.indexOf(pString));
        String i = String.valueOf((char) 105);
        print("5: " + strings.indexOf(i));
        print("6: " + strings.remove(i));
// Must be the exact object:
        print("7: " + strings.remove(pString));
        print("8: " + strings);
        strings.add(3,String.valueOf((char)121)); // Insert at an index
        print("9: " + strings);
        List<String> subString = strings.subList(1, 4);
        print("subList: " + subString);
        print("10: " + strings.containsAll(subString));
        Collections.sort(subString); // In-place sort
        print("sorted subList: " + subString);
// Order is not important in containsAll():
        print("11: " + strings.containsAll(subString));
        Collections.shuffle(subString, rand); // Mix it up
        print("shuffled subList: " + subString);
        print("12: " + strings.containsAll(subString));
        List<String> copyString = new ArrayList<>(strings);
        subString = Arrays.asList(strings.get(1), strings.get(4));
        print("sub: " + subString);
        copyString.retainAll(subString);
        print("13: " + copyString);
        copyString = new ArrayList<>(strings); // Get a fresh copy
        copyString.remove(2); // Remove by index
        print("14: " + copyString);
        copyString.removeAll(subString); // Only removes exact objects
        print("15: " + copyString);
        copyString.set(1, String.valueOf((char)99)); // Replace an element
        print("16: " + copyString);
        copyString.addAll(2, subString); // Insert a list in the middle
        print("17: " + copyString);
        print("18: " + strings.isEmpty());
        strings.clear(); // Remove all elements
        print("19: " + strings);
        print("20: " + strings.isEmpty());
        strings.addAll(createListOfChars(4));
        print("21: " + strings);
        Object[] oStrings = strings.toArray();
        print("22: " + oStrings[3]);
        String[] paStrings = strings.toArray(new String[0]);
        print("23: " + paStrings[3].getClass().getName());
    }
}
