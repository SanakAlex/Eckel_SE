package java_8_for_impatient.с_1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;

class Ex_3 {

    @Test
    void perform() {
        Arrays.asList(getAllFilesByType(".", ".iml")).forEach(System.out::println);
    }

    private File[] getAllFilesByType(String directory, String fileType) {
        return new File(directory).listFiles(pathname -> pathname.getName().endsWith(fileType));
    }
}
