package C_12;

import java.io.FileInputStream;

public class Ex_26 {
    public static void main(String[] args) throws Exception {
// Open the file:
        FileInputStream file =
                new FileInputStream("MainException.java");
// Use the file ...
// Close the file:
        file.close();
    }
}
