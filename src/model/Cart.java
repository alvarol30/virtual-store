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
    public void agregarProducto(Product product){
        products.add(product);
        System.out.println("Producto agregado: "+product.getName());
    }
    public void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }
    public double calcularTotal(){
        double total = 0;
        for(Product product: products){
            total = total + product.getPrice();
        }
        return total;
    }
    public double calcularTotalConDescuento(){
        return discountStrategy.applyDiscount(calcularTotal());
    }
}
