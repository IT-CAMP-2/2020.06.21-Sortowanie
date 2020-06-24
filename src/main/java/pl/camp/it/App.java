package pl.camp.it;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(3);
        lista.add(10);
        lista.add(7);
        lista.add(0);

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "BMW", "3", 150000));
        cars.add(new Car(2, "Audi", "A5", 300000));
        cars.add(new Car(3, "Toyota", "Corolla", 130000));
        cars.add(new Car(4, "Honda", "Civic", 130000));

        System.out.println(cars);

        Collections.sort(cars);

        System.out.println(cars);

        List<Pet> pets = new ArrayList<>();

        pets.add(new Pet(10, "Reksio"));
        pets.add(new Pet(4, "Mruczek"));
        pets.add(new Pet(6, "Rex"));

        System.out.println(pets);

        Scanner s = new Scanner(System.in);
        switch (s.nextLine()) {
            case "I":
                Collections.sort(pets, new Comparator<Pet>() {
                    @Override
                    public int compare(Pet pet, Pet t1) {
                        return pet.getName().compareTo(t1.getName());
                    }
                });
                break;
            case "W":
                Collections.sort(pets, new PorownywaczZwierzat());
                break;
        }

        KlasaAbstrakcyjna o = new KlasaAbstrakcyjna() {
            @Override
            void cos(int a) {

            }
        };

        System.out.println(pets);
    }
}
