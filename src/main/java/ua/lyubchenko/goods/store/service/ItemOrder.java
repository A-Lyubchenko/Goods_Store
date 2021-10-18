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
        int promotional = (int) (((product.getPrice() / 100.0) * product.getPromotional()) * amount);
        return product.getPrice() * amount - promotional;
    }


}
