package Assignment3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String buildingNumber;
    private List<Apartment> apartmentList;
    private double maintenanceCost;

    public Building() {
        apartmentList = new ArrayList<>();
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void addApartment(Apartment apartment){
        apartmentList.add(apartment);
    }

    public List<Apartment> getApartmentList() {
        return apartmentList;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public double getProfit(){
        double totalRent = 0.0;
        for(Apartment apartment: apartmentList){
            totalRent += apartment.getRent();
        }
        return totalRent - getMaintenanceCost();
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingNumber='" + buildingNumber + '\'' +
                ", apartmentList=" + apartmentList +
                ", maintenanceCost=" + maintenanceCost +
                '}';
    }
}
