package Assignment2.prob2B.extra;

import Assignment2.prob2B.Order;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Date;

public class MainRunner {
    public static void main(String[] args) {
        Order order = new Order(1, LocalDate.now());
        order.getOrderLine().setOrderlinenum(3);
        order.getOrderLine().setPrice(25);
        order.getOrderLine().setQuatity(5);

        int orderLinenum = order.getOrderLine().getOrderlinenum();
        int qty = order.getOrderLine().getQuatity();
        double price = order.getOrderLine().getPrice();

        System.out.println("Ordernm: "+order.getOrderNum()+", Order Date:"+order.getOrderDate());
        System.out.println("Orderlinenum : "+orderLinenum+" Total order (price*qty): ("+price+"*"+qty+") = "+price*qty);
    }
}
