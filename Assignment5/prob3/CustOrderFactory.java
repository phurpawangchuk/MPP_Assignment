package Assignment5.prob3;

import java.time.LocalDate;
import java.util.List;

public final class CustOrderFactory {

    private CustOrderFactory(){}

    public static Customer addCustomer(String name){
        Customer customer = new Customer(name);
        return customer;
    }

    public static Order addOrder(LocalDate orderDate){
        Order order = new Order(orderDate);
        return order;
    }

    public static Item addItem(String name, int qty){
        Item item = new Item(name,qty);
        return item;
    }

}
