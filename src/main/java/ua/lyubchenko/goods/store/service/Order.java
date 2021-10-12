package ua.lyubchenko.goods.store.service;

import java.util.List;

public class Order {
    private final List<ItemOrder> itemOrders;

    public Order(List<ItemOrder> itemOrders) {
        this.itemOrders = itemOrders;
    }

    public Integer getItemsSum() {
        return itemOrders.stream()
                .map(ItemOrder::getItemPrice)
                .reduce(Integer::sum).orElse(0);

    }

}
