package Assignment4;

public final class Paycheck {

    private double grossPay = 0.0;
    private static final double fica = 0.23;
    private static final double stateTax = 0.05;
    private static final double localTax = 0.01;
    private static final double medicare = 0.03;
    private static final double socialSecurity = 0.075;

    public Paycheck(double grossPay) {
        this.grossPay = grossPay;
    }

    public void print() {
        System.out.println("Fica: "+ fica);
        System.out.println("State: "+ stateTax);
        System.out.println("Local: "+ localTax);
        System.out.println("Medicare: "+ medicare);
        System.out.println("Social Security: "+ socialSecurity);
    }

    public double getNetPay() {
        return grossPay - (grossPay * (fica + stateTax + localTax + medicare + socialSecurity));
    }
}
