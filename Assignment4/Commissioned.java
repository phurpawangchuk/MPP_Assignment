package Assignment4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
    private double comission;
    private double baseSalary;
    private List<Order> orders = new ArrayList<>();

     public Commissioned(String empId, double comission, double baseSalary, List<Order> orders) {
        super(empId);
        this.comission = comission;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public double getComission() {
        return comission;
    }

    public void addOrder(Integer orderNo, LocalDate orderDate, Double orderAmount) {
        if (orders == null) orders = new ArrayList<>();
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalSales=0;
        for(Order sal: orders) {
            if(month-1 == sal.getOrderDate().getMonthValue() && year == sal.getOrderDate().getYear()) {
                totalSales += sal.getOrderAmount();
            }
        }

        return baseSalary+comission*totalSales;
    }
}
