package ua.lyubchenko.goods.store;

import ua.lyubchenko.goods.store.service.Controller;

import ua.lyubchenko.goods.store.service.Order;


import java.util.*;

public class ProductStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        System.out.println("Введите вашу покупку");
        Order order = controller.setItemOrders(scanner.nextLine());
        System.out.format("Ваша цена составляет %d $.", order.getItemsSum());
    }
}
