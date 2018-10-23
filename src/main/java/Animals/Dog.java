package Animals;

import java.util.Date;

public class Dog extends Animal {
    private Date LastWalk;
    private double price;
    private static int id = 0;

    boolean NeedsAWalk() {
        return ((new Date().getTime() - LastWalk.getTime()) / (1000 * 60 * 60 * 24)) > 0;
    }

    public Dog(String name, Gender gender) {
        super(name, gender);
        LastWalk = new Date();
        price = 500 - id++ * 50;
    }

    @Override
    public double getPrice() {
        return price < 50 ? 50 : price;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Last walk: %s", LastWalk.toString());
    }

}
