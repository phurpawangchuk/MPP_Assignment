package Assignment3.prob3;

public abstract class Property {
    public abstract double computeRent();
    private Address address;

    Property(Address address){
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
