package enumeration.ex1;

import java.util.Date;

import enumeration.ex1.entities.Order;
import enumeration.ex1.enums.OrderStatus;

public class App {
    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
    }
}
