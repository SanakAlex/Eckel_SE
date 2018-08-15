package C_11;

import java.util.*;

class Pet {
    private String name;

    Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class PetSequence implements Iterable<Pet> {
    private int size;
    Pet[] pets;

    PetSequence(int size) {
        pets = new Pet[size];
        for (int i = 0; i < size; i++) {
            if (i % 5 == 0) {
                pets[i] = new Pet("Cat");
            } else if (i % 4 == 0) {
                pets[i] = new Pet("Dog");
            } else if (i % 3 == 0) {
                pets[i] = new Pet("Frog");
            } else if (i % 2 == 0) {
                pets[i] = new Pet("Rat");
            } else {
                pets[i] = new Pet("Lion");
            }
        }
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }
            public Pet next() { return pets[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
}

class NonCollectionSequence extends PetSequence {

    NonCollectionSequence(int size) {
        super(size);
    }
    public Iterable<Pet> reverse() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int index = pets.length - 1;
                    @Override
                    public boolean hasNext() {
                        return index > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[index--];
                    }
                };
            }
        };
    }
    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> randomizedPets = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(randomizedPets);
                return randomizedPets.iterator();
            }
        };
    }
}

public class Ex_32 {

    public static void main(String[] args) {
        NonCollectionSequence pets = new NonCollectionSequence(8);
        for (Pet pet : pets) {
            System.out.print(pet + " ");
        }
        System.out.println("\n------------- Random");
        for (Pet pet : pets.randomized()) {
            System.out.print(pet + " ");
        }
        System.out.println("\n------------- Reverse");
        for (Pet pet : pets.reverse()) {
            System.out.print(pet + " ");
        }
    }

}
