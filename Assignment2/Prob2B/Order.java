package Assignment2.Prob2B;

import java.time.LocalDate;

public class Order {
    private int orderNum;
    private LocalDate orderDate;

    private OrderLine orderLine;

    Order(int orderNum, LocalDate orderDate){
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        orderLine = new OrderLine(this);
    }

    public int getOrderNum() {
        return orderNum;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public OrderLine getOrderLine(){
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
