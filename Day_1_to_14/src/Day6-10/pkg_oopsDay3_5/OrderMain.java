package pkg_oopsDay3_5;

public class OrderMain {
    public static void main(String[] args) {
        // instance of PhysicalProductOrder
        Order physical = new PhysicalProductOrder("PP0101");
        physical.process_order();
        physical.print_order_summary();
        System.out.println();

        // instance of DigitalProductOrder
        Order digital = new DigitalProductOrder("DP0202");
        digital.process_order();
        digital.print_order_summary();
        System.out.println();

        // instance of ServiceOrder
        Order service = new ServiceOrder("S0303");
        service.process_order();
        service.print_order_summary();
    }
}
