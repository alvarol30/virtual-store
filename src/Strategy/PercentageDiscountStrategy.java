package Strategy;
public class PercentageDiscountStrategy implements DiscountStrategy{
    private float porcentaje;
    public PercentageDiscountStrategy(float porcentaje){
        this.porcentaje = porcentaje;
    }
    @Override
    public double applyDiscount(double total){
       return total - (total * porcentaje / 100);
    }
}
