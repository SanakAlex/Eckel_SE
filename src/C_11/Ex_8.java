package C_11;

import java.util.ArrayList;

public class Ex_8 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            gerbils.add(new Gerbil(3));
        }
        for (Gerbil gerbil : gerbils) {
            gerbil.hop();
        }
    }
}
