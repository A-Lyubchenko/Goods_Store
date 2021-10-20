package ua.lyubchenko.goods.store.service;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderTest {
    private Order order;
    private final ProductService service = new ProductService();
    private final List<ItemOrder> items = new ArrayList<>();

    @Test
    public void sumShouldBeWithoutPromotional() {
        ItemOrder a = service.getItem("A", 1);
        ItemOrder b = service.getItem("B", 1);
        ItemOrder c = service.getItem("C", 1);
        ItemOrder d = service.getItem("D", 1);
        items.add(a);
        items.add(b);
        items.add(c);
        items.add(d);
        order = service.getTotalCoast(items);
        Float expected = 7.25f;
        Assert.assertEquals(expected, order.getItemsSum());

    }


    @Test
    public void sumShouldBePromotional() {
        ItemOrder a = service.getItem("A", 3);
        order = new Order(Collections.singletonList(a));
        Float expected = 3f;
        Assert.assertEquals(expected, order.getItemsSum());

    }

}