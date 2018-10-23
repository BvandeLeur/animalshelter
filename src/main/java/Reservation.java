import Animals.*;
import java.util.ArrayList;

class Reservation {
    private static Reservation instance = new Reservation();
    private ArrayList<Animal> Animals = new ArrayList<>();

    private Reservation() {

    }

    static Reservation getInstance() {
        return instance;
    }

    ArrayList<Animal> getAnimals() {
        return Animals;
    }

    void newCat(String name, Gender gender, String badHabits) {
        Animals.add(new Cat(name, gender, badHabits));
    }

    void newDog(String name, Gender gender) {
        Animals.add(new Dog(name, gender));
    }
}
