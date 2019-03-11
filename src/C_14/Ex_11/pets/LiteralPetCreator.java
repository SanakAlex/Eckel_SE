//: C_14.Ex_11/pets/LiteralPetCreator.java
// Using class literals.
package C_14.Ex_11.pets;
import java.util.*;

public class LiteralPetCreator extends PetCreator {
    // No try block needed.
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class,  Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class,Hamster.class, Gerbil.class));
    // Types for random creation:
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class),
                    allTypes.size());
    public List<Class<? extends Pet>> types() {
        return types;
    }
    public static void main(String[] args) {
        System.out.println(types);
    }
} /* Output:
[class C_14.Ex_11.pets.Mutt, class C_14.Ex_11.pets.Pug, class C_14.Ex_11.pets.EgyptianMau, class C_14.Ex_11.pets.Manx, class C_14.Ex_11.pets.Cymric, class C_14.Ex_11.pets.Rat, class C_14.Ex_11.pets.Mouse, class C_14.Ex_11.pets.Hamster]
*///:~
