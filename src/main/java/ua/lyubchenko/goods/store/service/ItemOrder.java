package ua.lyubchenko.goods.store.service;

import lombok.Builder;
import ua.lyubchenko.goods.store.repository.Product;
@Builder
public class ItemOrder {
    private Product product;
    private int amount;


    public Integer getItemPrice() {

        return getItemPriceWithPromotional();
    }

    public Integer getItemPriceWithPromotional() {
        if (product.getPromotionalQuantity() == amount) {
            return product.getPromotionalPrice();
        }
        return product.getPrice() * amount;
    }


}
