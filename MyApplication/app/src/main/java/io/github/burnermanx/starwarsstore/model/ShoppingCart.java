package io.github.burnermanx.starwarsstore.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Burner on 29/05/2017.
 */

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
   }

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    public void removeProduct(Product product) {
        if (product != null) {
            products.remove(product);
        }
    }

    public long getTotalValue() {
        long total = 0L;
        for (Product product : products) {
            total = total + product.getPrice();
        }

        return total;
    }
}
