package ua.lyubchenko.goods.store.service;

import ua.lyubchenko.goods.store.repository.IRepository;
import ua.lyubchenko.goods.store.repository.Product;
import ua.lyubchenko.goods.store.repository.ProductRepository;


import java.util.ArrayList;
import java.util.List;


public class ProductService {
    private final IRepository iRepository;

    public ProductService() {
        this.iRepository = new ProductRepository();

    }

    public ItemOrder getItem(String id, int amount) {

        Product product = iRepository.getProductById(id);
        return ItemOrder.builder()
                .product(product)
                .amount(amount)
                .build();
    }

    public Order getTotalCoast(List<ItemOrder> itemOrders) {
        return new Order(new ArrayList<>(itemOrders));
    }

}
