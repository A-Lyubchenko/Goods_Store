package ua.lyubchenko.goods.store.repository;

import ua.lyubchenko.goods.store.repository.Product;

public interface IRepository {

    Product getProductById(String id);
}
