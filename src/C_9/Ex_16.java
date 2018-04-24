package C_9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class RandomChar {
    private Random random = new Random();

    public char next() {
        return (char) random.nextInt(65536);
    }
}

class AdapterRandomChar extends RandomChar implements Readable {

    int count;

    AdapterRandomChar(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = next() + " ";
        cb.append(result);
        return result.length();
    }
}

public class Ex_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(new AdapterRandomChar(6));
        while (s.hasNext()) {
            System.out.print(s.next() + " ");
        }
    }

}
