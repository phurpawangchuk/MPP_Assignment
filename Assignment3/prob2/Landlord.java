package Assignment3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private String owner;
    private List<Building> buildingList;

    public Landlord(String name){
        owner = name;
        buildingList = new ArrayList<>();
    }

    public void addBuilding(Building building){
        buildingList.add(building);
    }

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public double getProfit(){
        double profit = 0.0;
        for(Building b : buildingList){
            profit += b.getProfit();
        }

        return profit;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Landlord{" +
                "owner='" +
                '}';
    }
}
