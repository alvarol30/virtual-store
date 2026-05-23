package observer;
public class EmailNotificationObserver implements OrderObserver{
    public EmailNotificationObserver(){}
    @Override
    public void update(String message){
        System.out.println("Enviando correo al cliente...");
        System.out.println(message);
    }
}
