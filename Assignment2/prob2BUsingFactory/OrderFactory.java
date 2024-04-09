package Assignment2.prob2BUsingFactory;

import java.time.LocalDate;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-04
 */
public class OrderFactory {
    public static Order createOrder(int ordernum, LocalDate orderDate){

        Order order = new Order(ordernum, orderDate);
        order.setOrderLine(new OrderLine(order));

        return order;

    }
}
