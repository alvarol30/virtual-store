package adapter;
public class YapePaymentProcessor implements PaymentProcessor{
    public YapePaymentProcessor(){}
    @Override
    public void pay(double amount){
        System.out.println("Pago realizado con Yape: S/. " + amount);
    }
}
