import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class WebShopTests {
    private WebShop webShop = WebShop.getInstance();
    private Product product = new Product("Cat food", 11.23);

    @Test
    // Deze tests staan verkeerd om omdat IntelliJ
    // denkt dat het leuk is unit test verkeerd om te draaien.
    public void testRemoveProduct() {
        Assert.assertEquals(webShop.getProducts().size(), 0);
        webShop.removeProduct(product);
        Assert.assertEquals(webShop.getProducts().size(), 0);
    }

    @Test
    public void testNewProduct() {
        Assert.assertEquals(webShop.getProducts().size(), 0);
        webShop.newProduct(product);
        Assert.assertEquals(webShop.getProducts().size(), 1);
    }
}
