package java_8_for_impatient.с_1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;

class Ex_2 {

    static void main(String[] args) {

        System.out.println(Paths.get("").toAbsolutePath());

        File file = new File(".");
        File[] files = file.listFiles(File::isDirectory);
        System.out.println(Arrays.toString(files));

    }

    private static File[] getChildDirsWithLambda(String dir) {
        File dirFile = new File(dir);
        return dirFile.listFiles(d -> d.isDirectory());
    }

    private static File[] getChildDirsWithMethodReference(String dir) {
        File dirFile = new File(dir);
        return dirFile.listFiles(File::isDirectory);
    }

    @Test
    void perform() {
        Arrays.asList(getChildDirsWithLambda(".")).forEach(System.out::println);
        System.out.println("---------------------------------------------");
        Arrays.asList(getChildDirsWithMethodReference(".")).forEach(System.out::println);
    }
}
