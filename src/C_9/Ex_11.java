package C_9;

import static net.mindview.util.Print.print;

interface Processor {
    String name();

    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object o) {
        print("Using processor: " + p.name());
        print(p.process(o));
    }

    public static void main(String[] args) {
        String s = "asdfasgvavnaoivnvn1234567890";
        Apply.process(new Ex_11(), s);
    }
}

public class Ex_11 implements Processor {

    @Override
    public String process(Object line) {
        String line1 = (String) line;
        for (int i = 0; i < line1.length() - 1; i += 2) {
            String first = String.valueOf(line1.charAt(i));
            String second = String.valueOf(line1.charAt(i + 1));
            line1 = line1.substring(0, i) + second + first + line1.substring(i + 2);
        }
        return line1;
    }

    @Override
    public String name() {
        return getClass().getName();
    }

}
