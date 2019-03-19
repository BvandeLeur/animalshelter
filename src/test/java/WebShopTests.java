import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("SpellCheckingInspection")
public class WebShopTests {
    private WebShop webShop = WebShop.getInstance();
    private Product product = new Product("Cat food", 11.23);

    @Test
    // Deze tests staan verkeerd om omdat IntelliJ
    // denkt dat het leuk is unit test verkeerd om te draaien.
    public void testRemoveProduct() {
        assertEquals(webShop.getProducts().size(), 0);
        webShop.removeProduct(product);
        assertEquals(webShop.getProducts().size(), 0);
    }

    @Test
    public void testNewProduct() {
        assertEquals(webShop.getProducts().size(), 0);
        webShop.newProduct(product);
        assertEquals(webShop.getProducts().size(), 1);
    }
}
