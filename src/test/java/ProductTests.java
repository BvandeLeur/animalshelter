import org.junit.Assert;
import org.junit.Test;

public class ProductTests {
    private Product product = new Product("Cat food", 5.64);

    @Test
    public void testConstructor() {
        Assert.assertEquals(product.getName(), "Cat food");
        Assert.assertEquals(product.getPrice(), 5.64, 0.001);
    }
}
