package ua.lyubchenko.goods.store.service;

import lombok.Builder;
import ua.lyubchenko.goods.store.model.Product;

@Builder
public class ItemOrder {
    private Product product;
    private int amount;


    public Float getItemPrice() {
        if (product.getPromotionalQuantity()==0)
            return product.getPrice()*amount;
        int count = amount / product.getPromotionalQuantity();
        float promotionalCount = count * product.getPromotional();
        int result = (amount - (product.getPromotionalQuantity() * count));
        float price = result * product.getPrice();
        return promotionalCount + price;
    }
}
