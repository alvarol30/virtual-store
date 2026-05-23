package Strategy;
public class NoDiscountStrategy implements DiscountStrategy{
    public NoDiscountStrategy(){}
    @Override
    public double applyDiscount(double total){
        return total;
    }
}
