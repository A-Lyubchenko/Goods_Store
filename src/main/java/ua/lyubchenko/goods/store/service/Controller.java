package ua.lyubchenko.goods.store.service;

import java.util.*;

public class Controller {
    private static final Map<String, Integer> integerMap = new HashMap<>();
    public Order setItemOrders(String line) {
        List<ItemOrder> itemOrders = new ArrayList<>();
        ProductService productService = new ProductService();
        char[] chars = line.toCharArray();
        for (char aChar : chars) {
            integerMap.put(Character.toString(aChar),
                    integerMap.getOrDefault(Character.toString(aChar), 0) + 1);
        }
        for (Map.Entry<String, Integer> integerEntry : integerMap.entrySet()) {
            ItemOrder item = productService.getItem(integerEntry.getKey(), integerEntry.getValue());
            itemOrders.add(item);
        }

        return productService.getTotalCoast(itemOrders);

    }
}

