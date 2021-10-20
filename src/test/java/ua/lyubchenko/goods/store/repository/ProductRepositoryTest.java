package ua.lyubchenko.goods.store.repository;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.lyubchenko.goods.store.model.Product;

public class ProductRepositoryTest {

    private static IRepository iRepository;
    private static Product expectedApple;
    private static Product actualApple;

    public ProductRepositoryTest() {
        iRepository = new ProductRepository();
    }

    @BeforeClass
    public static void seUpExpected() {
        expectedApple = new Product("A", "Apple", 1,5,4);
    }

    @BeforeClass
    public static void setUpActual() {
        iRepository = new ProductRepository();

        actualApple = iRepository.getProductById("A");
    }

    @Test
    public void productShouldBeApple() {
        Assert.assertEquals(expectedApple.getName(), actualApple.getName());
    }

    @Test
    public void productShouldBeApplePrice() {

        Assert.assertEquals(expectedApple.getPrice(), actualApple.getPrice());
    }

    @Test
    public void productShouldBeAppleId() {
        Assert.assertEquals(expectedApple.getId(), actualApple.getId());
    }

    @Test
    public void notNull() {
        Assert.assertNotNull(actualApple);
    }

}