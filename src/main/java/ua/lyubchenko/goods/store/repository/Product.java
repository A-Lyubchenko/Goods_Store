package ua.lyubchenko.goods.store.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
    private String id;
    private String name;
    private int price;
    private int promotionalQuantity;
    private int promotionalPrice;
}
