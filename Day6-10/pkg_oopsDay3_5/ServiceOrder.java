package pkg_oopsDay3_5;

public class ServiceOrder extends Order {
    public ServiceOrder(String order_id) {
        super(order_id);
    }

    public void process_order() {
        System.out.println("Scheduling service for order " + order_id + ".");
    }
}
