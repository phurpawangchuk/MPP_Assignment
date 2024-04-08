package Assignment5.prob3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<Item> items;

    Order(LocalDate orderDate){
        this.orderDate = orderDate;
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", items=" + items.toString() +
                '}';
    }
}
