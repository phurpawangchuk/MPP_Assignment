package Assignment5.prob2;

public final class VechicleFactory {

    private VechicleFactory(){}
     public static Vehicle getVehicle(String vType){
        vType.toLowerCase();
        Vehicle vehicle = null;
        if(vType.equals("bus")){
            vehicle = new Bus();
        }
         if(vType.equals("car")){
             vehicle = new Car();
         }
         if(vType.equals("truck")){
             vehicle = new Truck();
         }
         if(vType.equals(("electriccar"))){
             vehicle = new ElectricCar();
         }
        return vehicle;
     }
}
