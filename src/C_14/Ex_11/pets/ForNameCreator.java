//: C_14.Ex_11/pets/ForNameCreator.java
package C_14.Ex_11.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "C_14.Ex_11.pets.Mutt",
    "C_14.Ex_11.pets.Pug",
    "C_14.Ex_11.pets.EgyptianMau",
    "C_14.Ex_11.pets.Manx",
    "C_14.Ex_11.pets.Cymric",
    "C_14.Ex_11.pets.Rat",
    "C_14.Ex_11.pets.Mouse",
    "C_14.Ex_11.pets.Hamster",
    "C_14.Ex_11.pets.Gerbil"
  };
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~
