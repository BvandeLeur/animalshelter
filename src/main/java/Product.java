import Animals.ISellable;

public class Product implements ISellable {
    private String Name;
    private double Price;

    Product(String name, double price) {
        Name = name;
        Price = price;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", Name, Price);
    }
}
