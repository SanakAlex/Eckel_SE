package java_8_for_impatient.с_1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;

class Ex_4 {

    @Test
    void perform() {
        Arrays.asList(getFilesSortedByTypeAndName(".")).forEach(System.out::println);
    }

    private File[] getFilesSortedByTypeAndName(String directory) {
        File[] files = new File(directory).listFiles();
        Arrays.sort(files, (f1, f2) -> {
            if (f1.isDirectory() && !f2.isDirectory())
                return -1;
            else if (!f1.isDirectory() && f2.isDirectory())
                return 1;
            else {
                return f1.compareTo(f2);
            }
        });
        return files;
    }
}
