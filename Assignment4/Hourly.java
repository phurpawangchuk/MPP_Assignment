package Assignment4;

public class Hourly extends Employee{
    private double hourlyWage;
    private int hoursPerWeeek;

    public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeeek = hoursPerWeek;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursPerWeeek() {
        return hoursPerWeeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeeek * 4;
    }
}
