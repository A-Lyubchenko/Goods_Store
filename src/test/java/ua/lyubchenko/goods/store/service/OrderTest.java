package ua.lyubchenko.goods.store.service;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderTest {
    private Order order;
    private final ProductService service = new ProductService();
    private final List<ItemOrder> items = new ArrayList<>();
    private ItemOrder a;

    @Before
    public void setUp() {
        a = service.getItem("A", 1);
        ItemOrder b = service.getItem("B", 1);
        ItemOrder c = service.getItem("C", 1);
        ItemOrder d = service.getItem("D", 1);
        items.add(a);
        items.add(b);
        items.add(c);
        items.add(d);
        order = new Order(new ArrayList<>(items));
    }

    @Test
    public void sumShouldBeTen() {
        order = service.getTotalCoast(items);
        Integer expected = 10;
        Assert.assertEquals(expected, order.getItemsSum());

    }


    @Test
    public void sumShouldBeApplePromotional() {
        a = service.getItem("A", 5);
        order = new Order(Collections.singletonList(a));
        Integer expected = 4;
        Assert.assertEquals(expected, order.getItemsSum());

    }

}