package service;
import adapter.PaymentProcessor;
import model.Cart;
import observer.OrderObserver;
import java.util.ArrayList;
import java.util.List;
public class OrderService{
    private Cart cart;
    private PaymentProcessor paymentProcessor;
    private List<OrderObserver> observers;

    public OrderService(Cart cart, PaymentProcessor paymentProcessor){
        this.cart = cart;
        this.paymentProcessor = paymentProcessor;
        this.observers = new ArrayList<>();
    }
    public void addObserver(OrderObserver observer){
        observers.add(observer);
    }
    public void notifyObservers(String message){
        for (OrderObserver observer : observers){
            observer.update(message);
        }
    }
    public void confirmOrder(){
        double totalOriginal = cart.calcularTotal();
        double totalFinal = cart.calcularTotalConDescuento();
        System.out.println("\n========== RESUMEN ==========");
        System.out.println("Total original: S/ " + totalOriginal);
        System.out.println("Descuento Aplicado: -S/ " + (totalOriginal - totalFinal));
        System.out.println("Total final: S/ " + totalFinal);
        paymentProcessor.pay(totalFinal);
        String message = "\nCompra confirmada por S/ " + totalFinal;
        System.out.println(message);
        notifyObservers(message);
    }
}