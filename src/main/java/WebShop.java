import Animals.ISellable;

import java.util.ArrayList;

class WebShop {
    private ArrayList<ISellable> products = new ArrayList<>();
    private static WebShop instance = new WebShop();

    private WebShop() {

    }

    static WebShop getInstance() {
        return instance;
    }

    void newProduct(Product product) {
        products.add(product);
    }

    void removeProduct(Product product) {
        products.remove(product);
    }

    ArrayList<ISellable> getProducts() {
        return products;
    }
}
