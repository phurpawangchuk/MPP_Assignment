package Assignment2.prob2BUsingFactory;

import java.time.LocalDate;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-04
 */
public class Order {
    private int ordernum;
    private LocalDate orderDate;

    private OrderLine orderLine;

    Order(int ordernum, LocalDate orderDate){
        this.ordernum = ordernum;
        this.orderDate = orderDate;

        orderLine = new OrderLine(this);
    }

    public int getOrdernum() {
        return ordernum;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
