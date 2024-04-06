package Assignment4;

public abstract class Employee {
    private String empId;

    Employee(String empId) {
        this.empId = empId;
    }

    public  void print(int month, int year){
        System.out.println("Employee Id : "+empId);
        System.out.println("Paystub: ");
        System.out.println("\tGross Pay: "+calcGrossPay(month,year));
        calcCompensation(month,year).print();
        System.out.println("\nNET PAY: "+calcCompensation(month,year).getNetPay());
        System.out.println("................................................................................");
    }

    public Paycheck calcCompensation(int month, int year){
        Paycheck paycheck = new Paycheck(calcGrossPay(month, year));
        return paycheck;
    }
    public abstract double calcGrossPay(int month, int year);

}
