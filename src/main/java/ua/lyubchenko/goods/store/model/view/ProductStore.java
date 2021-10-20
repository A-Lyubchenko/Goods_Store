package ua.lyubchenko.goods.store.model.view;

import ua.lyubchenko.goods.store.сontrollers.ProductController;

import ua.lyubchenko.goods.store.service.Order;


import java.util.*;

public class ProductStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductController controller = new ProductController();
        System.out.println("Введите вашу покупку");
        Order order = controller.setItemOrders(scanner.nextLine());
        System.out.format("Ваша цена составляет %f $.", order.getItemsSum());
    }
}
