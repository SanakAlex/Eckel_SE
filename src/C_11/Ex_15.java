package C_11;

import net.mindview.util.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Ex_15 {
    public static void main(String[] args) {
        String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        ArrayList<String> arrayList = new ArrayList<>();
        Stack<String> stringStack = new Stack<>();
        Collections.addAll(arrayList, s.split(""));
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            switch (listIterator.next()) {
                case "+":
                    stringStack.push(listIterator.next());
                    break;
                case "-":
                    System.out.print(stringStack.pop());
                    break;
            }
        }
        System.out.println();
        System.out.println(arrayList.toString());
    }
}
