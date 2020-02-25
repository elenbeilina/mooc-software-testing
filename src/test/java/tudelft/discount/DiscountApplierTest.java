package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    private Product business;
    private Product home;
    List<Product> results;

    @BeforeEach
    public void initialize() {
        business = new Product("business", 20.0,"BUSINESS");
        home = new Product("home", 10.0,"HOME");
        results = Arrays.asList(business, home);
    }

    @Test
    void applyOneDiscount() {
        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();

        Assertions.assertEquals(business, results.get(0));
    }

    @Test
    void checkRightDiscounts() {
        double expectedBusiness = business.getPrice() * 1.1;
        double expectedHome = home.getPrice() * 0.9;

        ProductDao dao = Mockito.mock(ProductDao.class);

        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();

        Assertions.assertEquals(business.getPrice(), expectedBusiness);
        Assertions.assertEquals(home.getPrice(), expectedHome);
    }
}
