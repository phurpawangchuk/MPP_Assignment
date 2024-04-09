package Assignment2.prob2BUsingFactory;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-04
 */
public class OrderLine {
    private int orderlinenum;
    private int qty;
    private double price;

    private Order orderAsOwner;

    OrderLine(Order order){
        orderAsOwner = order;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setOrderlinenum(int orderlinenum) {
        this.orderlinenum = orderlinenum;
    }

    public int getOrderlinenum() {
        return orderlinenum;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
