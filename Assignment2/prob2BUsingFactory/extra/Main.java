package Assignment2.prob2BUsingFactory.extra;

import Assignment2.prob2BUsingFactory.Order;
import Assignment2.prob2BUsingFactory.OrderFactory;

import java.time.LocalDate;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-04
 */
public class Main {
    public static void main(String[] args) {
        Order order = OrderFactory.createOrder(1, LocalDate.now());
        order.getOrderLine().setOrderlinenum(5);
        order.getOrderLine().setPrice(25);
        order.getOrderLine().setQty(10);

        System.out.println("order num:"+order.getOrdernum()+
                "\nOrderlinenum:"+order.getOrderLine().getOrderlinenum()+
                "\nPrice:"+order.getOrderLine().getPrice()+
                "\nQty:"+order.getOrderLine().getQty()
        );

    }
}
