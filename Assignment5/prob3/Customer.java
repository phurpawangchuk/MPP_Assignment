package Assignment5.prob3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    Customer(String n){
        name = n;
        orders = new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", orders=" + orders +
                '}';
    }
}
