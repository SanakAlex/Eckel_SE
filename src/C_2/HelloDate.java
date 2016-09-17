package C_2;

//: object/HelloDate.java

import java.util.Date;

/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */

public class HelloDate {


    /** Entry point to class and application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        /** Метод выводит приветствие*/
        System.out.println("Hello, it's: ");
        /** Метод выводит дату*/
        System.out.println(new Date());
    }
} /* Output: (55% match)
Hello, it's:
Wed Oct 05 14:39:36 MDT 2005
*///:~
