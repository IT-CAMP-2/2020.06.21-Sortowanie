package pl.camp.it;

import java.util.Comparator;

public class PorownywaczZwierzat2 implements Comparator<Pet> {
    @Override
    public int compare(Pet pet, Pet t1) {
        return pet.getName().compareTo(t1.getName());
    }
}
