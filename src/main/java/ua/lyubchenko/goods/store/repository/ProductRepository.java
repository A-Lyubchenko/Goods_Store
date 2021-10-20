package ua.lyubchenko.goods.store.repository;

import ua.lyubchenko.goods.store.model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository implements IRepository {
    private final Map<String, Product> PRODUCTS = new HashMap<>();

    {
        PRODUCTS.put("A", new Product("A", "Apple", 1.25f, 3, 3f));
        PRODUCTS.put("B", new Product("B", "Banana", 4.25f));
        PRODUCTS.put("C", new Product("C", "Citrus", 1f, 6, 5f));
        PRODUCTS.put("D", new Product("D", "Date", 0.75f));
    }

    public Product getProductById(String id) {
        return PRODUCTS.get(id);
    }

}
