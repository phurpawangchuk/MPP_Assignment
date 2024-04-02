package Assignment2.prob2B;

public class OrderLine {
    private int orderlinenum;
    private double price;
    private int quatity;

    private Order owner;

    OrderLine(Order order){
        owner = order;
    }

    public void setOrderlinenum(int orderlinenum) {
        this.orderlinenum = orderlinenum;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public int getOrderlinenum() {
        return orderlinenum;
    }

    public double getPrice() {
        return price;
    }

    public int getQuatity() {
        return quatity;
    }
}
