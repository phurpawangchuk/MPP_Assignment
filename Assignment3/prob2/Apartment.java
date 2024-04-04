package Assignment3.prob2;

public class Apartment {
    private String apartmentNumber;
    private double rent;

    public Apartment(String apartmentNumber, double rent){
        this.apartmentNumber = apartmentNumber;
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentNumber='" + apartmentNumber + '\'' +
                ", rent=" + rent +
                '}';
    }
}
