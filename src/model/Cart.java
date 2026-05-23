package model;
import Strategy.DiscountStrategy;
import Strategy.NoDiscountStrategy;
import java.util.ArrayList;
import java.util.List;

public class Cart{
    private DiscountStrategy discountStrategy;
    private List<Product> products;

    public Cart(){
        products = new ArrayList<>();
        discountStrategy = new NoDiscountStrategy();
    }
}
