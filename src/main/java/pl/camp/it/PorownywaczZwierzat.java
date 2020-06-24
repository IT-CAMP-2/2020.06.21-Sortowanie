package pl.camp.it;

import java.util.Comparator;

public class PorownywaczZwierzat implements Comparator<Pet> {
    @Override
    public int compare(Pet pet, Pet t1) {
        return pet.getAge() - t1.getAge();
    }
}
