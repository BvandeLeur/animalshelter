import org.junit.jupiter.api.Test;

public class ProductTests {
    private Product product = new Product("Cat food", 5.64);

    @Test
    public void testConstructor() {
        assert(product.getName() == "Cat food");
        assert(product.getPrice()== 5.64);
    }
}
