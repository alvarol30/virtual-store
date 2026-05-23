package observer;
public class InventoryObserver implements OrderObserver{
    public InventoryObserver(){}
    @Override
    public void update(String message){
        System.out.println("Actualizando inventario...");
        System.out.println(message);
    }
}