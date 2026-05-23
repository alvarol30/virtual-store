package Strategy;
public class FixedAmountDiscountStrategy implements DiscountStrategy{
    private float MontoDescuento;
    public FixedAmountDiscountStrategy(float MontoDescuento) {
        this.MontoDescuento = MontoDescuento;
    }
    public double applyDiscount(double total) {
        double MontoFinal= total - MontoDescuento;
        if(MontoFinal < 0){
            return 0;
        }
        else{
            return MontoFinal;
        }
    }
}
