package C_14;

import java.lang.reflect.Field;
import java.util.HashMap;

import static net.mindview.util.Print.print;

class Candy {
    static {
        print("Loading Candy");
    }
}

class Gum {
    static {
        print("Loading Gum");
    }
}

class Cookie {
    static {
        print("Loading Cookie");
    }
}

public class Ex_7_8_9_10 {

    /**
     * Ex_8 part
     * method recursively displays all hierarchy of class
     *
     * @param classToDisplayHierarchy class to display hierarchy info
     */
    static void displayClassHierarchy(Class<?> classToDisplayHierarchy) {
        print("------" + classToDisplayHierarchy.getName() + "-------");
        print("simple name: " + classToDisplayHierarchy.getSimpleName());
        print("canonical name: " + classToDisplayHierarchy.getCanonicalName());
        print("is interface: " + (classToDisplayHierarchy.isInterface() ? "[yes]" : "[no]"));

        //Ex_9 part
        Field[] declaredFields = classToDisplayHierarchy.getDeclaredFields();
        if (declaredFields.length > 0) {
            print("\n-declared fields-");
            for (Field declaredField : declaredFields) {
                System.out.print(declaredField.getName() + "; ");
            }
            System.out.println();
        }

        Class<?>[] interfaces = classToDisplayHierarchy.getInterfaces();
        if (interfaces.length > 0) {
            print("\n--interfaces of " + classToDisplayHierarchy.getSimpleName() + "--");

            for (Class<?> anInterface : interfaces) {
                displayClassHierarchy(anInterface);
            }
        }
        Class<?> superclass = classToDisplayHierarchy.getSuperclass();
        if (superclass != null) {
            print("\n--parent hierarchy--");
            displayClassHierarchy(superclass);
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            print("inside main without args");
            new Candy();
            print("After creating Candy");
            try {
                Class.forName("Gum");
            } catch (ClassNotFoundException e) {
                print("Couldn't find Gum");
            }
            print("After Class.forName(\"Gum\")");
            new Cookie();
            print("After creating Cookie");
            System.exit(1);
        }
        print("inside main with args");
        String className = args[0];
        try {
            Class.forName("C_14." + className);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found");
        }

        System.out.println("---Ex_8---");

        displayClassHierarchy(HashMap.class);

        System.out.println("---Ex_10---");
        char[] chars = new char[0];
//        char chars = '5';
        if (chars instanceof Object) {
            System.out.println("char[] is object");
        } else {
            System.out.println("char[] is primitive");
        }
    }
}
