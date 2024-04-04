package Assignment3.prob2.extra;


import Assignment3.prob2.Apartment;
import Assignment3.prob2.Building;
import Assignment3.prob2.Landlord;

public class Main {
	public static void main(String[] args) {
		
		   // Create apartments
        Apartment apt1 = new Apartment(1000);
        Apartment apt2 = new Apartment(1200);
        Apartment apt3 = new Apartment(900);

        // Create buildings
        Building building1 = new Building(500);
        Building building2 = new Building(600);

        // Add apartments to buildings
        building1.addApartment(apt1);
        building1.addApartment(apt2);
        building2.addApartment(apt3);

        // Create landlord
        Landlord landlord = new Landlord();

        // Add buildings to landlord
        landlord.addBuilding(building1);
        landlord.addBuilding(building2);

        // Calculate and print total monthly profits
        double totalProfits = landlord.calculateMonthlyTotalProfits();
        System.out.println("Total monthly profits: $" + totalProfits);
    }
		
		
	}


