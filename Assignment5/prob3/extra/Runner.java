package Assignment5.prob3.extra;

import Assignment5.prob3.CustOrderFactory;
import Assignment5.prob3.Customer;
import Assignment5.prob3.Item;
import Assignment5.prob3.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Item item1 = CustOrderFactory.addItem("Book", 5);
        Item item2 = CustOrderFactory.addItem("Pen", 5);
        Item item3 = CustOrderFactory.addItem("Shoe", 5);

        Order order1 = CustOrderFactory.addOrder(LocalDate.now());
        Order order2 = CustOrderFactory.addOrder(LocalDate.now());
        Order order3 = CustOrderFactory.addOrder(LocalDate.now());

        order1.addItem(item1);
        order2.addItem(item2);
        order3.addItem(item3);

        Customer customer = CustOrderFactory.addCustomer("ALice");

        customer.addOrder(order1);
        customer.addOrder(order2);
        customer.addOrder(order3);


        System.out.println(customer);

    }
    }
