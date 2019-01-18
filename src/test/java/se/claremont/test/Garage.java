package se.claremont.test;

public class Garage {
    Vehicle[] vehicles = new Vehicle[10];
    String address;

    public Garage(String address){
        this.address = address;
    }

    public void parkVehicle(int place, Vehicle vehicle){
        vehicles[place]=vehicle;
    }
    public Vehicle checkVehicle(int place){
        return vehicles[place];
    }

    //En metod som flyttar en bil från en plats i garaget till en annan
    public void moveCars(int parkingSpace, Vehicle vehicle){
        vehicles[parkingSpace] = vehicle;
    }

    public int getNumberOfCarsWithValueOver(int price) {
        int numberOfCars = 0;
        for (int i = 0; i <= vehicles.length-1; i++) {
            if (vehicles[i] != null && vehicles[i].getPrice() > price) {
                numberOfCars++;
            }
        }
        return numberOfCars;
    }

    public int getHighestPrice(int price){
        int highestPrice = 0;
        for (int i = 0; i <= vehicles.length -1; i++){
            if (vehicles[i] != null && vehicles[i].getPrice() > highestPrice) {
                highestPrice= vehicles[i].getPrice();

            }
        } return highestPrice;
    }

    public String getMostExpensiveVehicle(Vehicle tempVehicle){
       // Vehicle tempVehicle = new Vehicle("Porsche", "Snabb");
      //  tempVehicle.setPrice(100);

        for (int i = 0; i <= vehicles.length -1; i++){
            if (vehicles[i] != null && vehicles[i].getPrice() > tempVehicle.getPrice()) {
                tempVehicle.setPrice(vehicles[i].getPrice());
                tempVehicle.setMake(vehicles[i].getMake());
                tempVehicle.setModel(vehicles[i].getModel());
            }
        }
        return tempVehicle.getMake();
    }
}
