package C_8;

import static net.mindview.util.Print.print;

/**
 * Created by Alex on 01.10.2016.
 */
class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}
class RectangularGlyph extends Glyph {
    private int sideLength = 1;
    RectangularGlyph(int l) {
        sideLength = l;
        print("RectangularGlyph.RectangularGlyph(), side length = " + sideLength);
    }
    void draw() {
        print("RectangularGlyph.RectangularGlyph(), side length = " + sideLength);
    }
}
public class Ex_16 {
    public static void main(String[] args) {
        new RectangularGlyph(15);
    }
}
