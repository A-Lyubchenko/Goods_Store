package ua.lyubchenko.goods.store;

import ua.lyubchenko.goods.store.service.ItemOrder;
import ua.lyubchenko.goods.store.service.Order;
import ua.lyubchenko.goods.store.service.ProductService;

import java.util.*;

public class ProductStore {
    private static final Map<String, Integer> integerMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ItemOrder> itemOrders = new ArrayList<>();
        ProductService productService = new ProductService();
        System.out.println("Введите вашу покупку");
        char[] chars = scanner.nextLine().toCharArray();
        for (char aChar : chars) {
            integerMap.put(Character.toString(aChar),
                    integerMap.getOrDefault(Character.toString(aChar), 0) + 1);
        }
        for (Map.Entry<String, Integer> integerEntry : integerMap.entrySet()) {
            ItemOrder item = productService.getItem(integerEntry.getKey(), integerEntry.getValue());
            itemOrders.add(item);
        }


        Order totalCoast = productService.getTotalCoast(itemOrders);
        System.out.format("Ваша цена составляет %d $.", totalCoast.getItemsSum());
    }
}
