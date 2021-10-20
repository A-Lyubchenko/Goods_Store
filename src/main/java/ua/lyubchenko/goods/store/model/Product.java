package ua.lyubchenko.goods.store.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {
    private String id;
    private String name;
    private float price;
    private int promotionalQuantity;
    private float promotional;


    public Product(String id, String name, float price) {
        this.id =id;
        this.name = name;
        this.price = price;
    }
}
