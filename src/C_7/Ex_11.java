package C_7;

/**
 * Created by Sanak Alex on 20.05.2016.
 */
class ModifiedDetergent{
    Cleanser cleanser = new Cleanser();
    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.scrub();
    }

    public String toString() {
        return cleanser.toString();
    }
}
public class Ex_11 {
}
