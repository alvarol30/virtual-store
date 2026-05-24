import adapter.*;
import model.Cart;
import model.Product;
import observer.AdminNotificationObserver;
import observer.EmailNotificationObserver;
import observer.InventoryObserver;
import service.OrderService;
import Strategy.FixedAmountDiscountStrategy;
import Strategy.PercentageDiscountStrategy;
public class Main {
    public static void main(String[] args) {
        // PRODUCTOSS
        Product laptop = new Product("Laptop Gamer", 3500);
        Product mouse = new Product("Mouse Logitech", 150);
        Product keyboard = new Product("Teclado Mecánico", 300);

        // CARRITO
        Cart cart = new Cart();
        cart.agregarProducto(laptop);
        cart.agregarProducto(mouse);
        cart.agregarProducto(keyboard);

        // STRATEGY
        cart.setDiscountStrategy(new PercentageDiscountStrategy(10));

        // ADAPTER
        ExternalPayPalService externalPayPalService = new ExternalPayPalService();
        PaymentProcessor paymentProcessor = new PayPalAdapter(externalPayPalService);

        // OBSERVER
        OrderService orderService = new OrderService(cart, paymentProcessor);
        orderService.addObserver(new EmailNotificationObserver());
        orderService.addObserver(new InventoryObserver());
        orderService.addObserver(new AdminNotificationObserver());

        // CONFIRMAR COMPRA
        orderService.confirmOrder();

    }
}