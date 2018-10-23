package Animals;

public class Cat extends Animal {
    private String BadHabits;

    public Cat(String name, Gender gender, String badHabits) {
        super(name, gender);
        BadHabits = badHabits;
    }

    String getBadHabits() {
        return BadHabits;
    }

    @Override
    public double getPrice() {
        double price = 350 - BadHabits.length() * 20;
        return price < 35 ? 35 : price;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", bad habits: %s", BadHabits.toLowerCase());
    }

}
