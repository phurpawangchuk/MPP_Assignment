package Assignment3.prob2.extra;

import Assignment3.prob2.Apartment;
import Assignment3.prob2.Building;
import Assignment3.prob2.Landlord;

import java.util.Arrays;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        Building building1 = new Building();
        building1.setBuildingNumber("B101");
        building1.setMaintenanceCost(500);
        Apartment apartment1 = new Apartment("A101",500);
        Apartment apartment2 = new Apartment("A102",500);
        Apartment apartment3 = new Apartment("A103",500);
        Apartment apartment4 = new Apartment("A104",500);
        building1.addApartment(apartment1);
        building1.addApartment(apartment2);
        building1.addApartment(apartment3);
        building1.addApartment(apartment4);

        Building building2 = new Building();
        building2.setBuildingNumber("B201");
        building2.setMaintenanceCost(500);
        Apartment apartment5 = new Apartment("A201",500);
        Apartment apartment6 = new Apartment("A202",500);
        Apartment apartment7 = new Apartment("A203",500);
        Apartment apartment8 = new Apartment("A204",500);
        building2.addApartment(apartment5);
        building2.addApartment(apartment6);
        building2.addApartment(apartment7);
        building2.addApartment(apartment8);

        Landlord landlord = new Landlord("Alice");
        landlord.addBuilding(building1);
        landlord.addBuilding(building2);
        System.out.println(landlord);


        List<Building> buildings = Arrays.asList(building1, building2);

        for(Building building: buildings){
            System.out.println(building);
            for(Apartment apartment: building.getApartmentList()){
                System.out.println(apartment);
            }
        }

        System.out.println("Monthly profit:"+landlord.getProfit());


    }
}
