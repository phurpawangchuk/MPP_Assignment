package Assignment2.prob2B.extra;

import Assignment2.prob2B.Order;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        Order order = new Order(1, LocalDate.now(), 1, 25.0, 5);
        order.addOrderLine(1,5.0,3);

        Order order1 = new Order(2,LocalDate.now().plusDays(1), 2, 5.0, 5);
        order1.addOrderLine(2,5.5, 4);
        order1.addOrderLine(3,3.5, 4);
        order1.addOrderLine(5,4.5, 4);

        List<Order> orders = Arrays.asList(order,order1);

        System.out.println(orders);
    }
}
