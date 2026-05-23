package adapter;
public class CreditCardPaymentProcessor implements PaymentProcessor{
    public CreditCardPaymentProcessor(){}
    @Override
    public void pay(double amount){
        System.out.println("Pago realizado con tarjeta: S/. " + amount);
    }
}
