package Assignment2.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private LocalDate orderDate;

    private List<OrderLine> orderLines;

    public Order(int orderNum, LocalDate orderDate, int lineNum, double price, int qty){
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        orderLines = new ArrayList<>();
        addOrderLine(lineNum,price,qty);
    }

    public void addOrderLine(int linenum, double price, int qty){
        orderLines.add(new OrderLine(linenum, price,qty, this));
    }

    @Override
    public String toString() {
        String msg = "Order: \n";
        for(OrderLine o : orderLines) {
            msg += o.toString() + "\n";

        }
        return msg;
    }
}
