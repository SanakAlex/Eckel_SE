/**
 * Created by Sanak Alex on 19.05.2016.
 */
package C_7;

import static net.mindview.util.Print.*;

class Game {
    Game(int i) {
        print("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }
}

public class Ex_6 extends BoardGame {
    Ex_6() {
        super(11);
        print("Chess constructor");
    }
    public static void main(String[] args) {
        Ex_6 x = new Ex_6();
    }
}