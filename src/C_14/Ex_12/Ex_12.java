package C_14.Ex_12;

import C_14.Ex_11.pets.Pet;
import C_14.Ex_12.coffee.Coffee;
import C_14.Ex_12.coffee.CoffeeGenerator;
import net.mindview.util.MapData;

import java.util.LinkedHashMap;
import java.util.Map;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class Ex_12 {

    static class CoffeeCounter
            extends LinkedHashMap<Class<? extends Coffee>,Integer> {
        public CoffeeCounter() {
            super(MapData.map(CoffeeGenerator.getTypes(), 0));
        }
        public void count(Coffee coffee) {
// Class.isInstance() eliminates instanceofs:
            for(Map.Entry<Class<? extends Coffee>,Integer> pair
                    : entrySet())
                if(pair.getKey().isInstance(coffee))
                    put(pair.getKey(), pair.getValue() + 1);
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for(Map.Entry<Class<? extends Coffee>,Integer> pair
                    : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length()-2, result.length());
            result.append("}");
            return result.toString();
        }
    }

    public static void main(String[] args) {
        CoffeeCounter coffeeCounter = new CoffeeCounter();
        for(Coffee coffee : CoffeeGenerator.createArray(20)) {
            printnb(coffee.getClass().getSimpleName() + " ");
            coffeeCounter.count(coffee);
        }
        print();
        print(coffeeCounter);
    }
}
