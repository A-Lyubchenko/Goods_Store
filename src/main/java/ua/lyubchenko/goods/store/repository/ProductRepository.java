package ua.lyubchenko.goods.store.repository;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository implements IRepository {
    private final Map<String, Product> PRODUCTS = new HashMap<>();

    {
        PRODUCTS.put("A", new Product("A", "Apple", 1, 5, 4));
        PRODUCTS.put("B", new Product("B", "Banana", 2, 4, 7));
        PRODUCTS.put("C", new Product("C", "Citrus", 3, 3, 8));
        PRODUCTS.put("D", new Product("D", "Date", 4, 3, 10));
    }

    public Product getProductById(String id) {
        return PRODUCTS.get(id);
    }

}
