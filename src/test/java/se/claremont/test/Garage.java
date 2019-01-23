package se.claremont.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Garage {
    Vehicle[] vehicles = new Vehicle[10];
    //List<Vehicle> vehicles2 = new Array
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

        // List<Vehicle> apa = Array.asList(vehicles);
        for (int i = 0; i <= vehicles.length - 1; i++) {
            if (vehicles[i] != null && vehicles[i].getPrice() > price) {
                numberOfCars++;
            }
        }
        return numberOfCars;
    }
 /*  public Vehicle getMostExpensiveVehicle(){
        Vehicle mostExpensiveVehicle;
        for (int i = 0; i <vehicles.length; i++){
            if (vehicles[i])!=null){
                if(mostExpensiveVehicle == null || vehicles[i]).getPrice())>mostExpensiveVehicle){
                mostExpensiveVehicle=vehicles[i];
            }
        }
    }
    return mostExpensiveVehicle;
   } */
            public int getHighestPrice(int price){
                int highestPrice = 0;
                for (int i = 0; i <= vehicles.length - 1; i++) {
                    if (vehicles[i] != null && vehicles[i].getPrice() > highestPrice) {
                        highestPrice = vehicles[i].getPrice();
                    }
                }
                return highestPrice;
            }

            public String getMostExpensiveVehicle(Vehicle tempVehicle){
                // Vehicle tempVehicle = new Vehicle("Porsche", "Snabb");
                //  tempVehicle.setPrice(100);

                for (int i = 0; i <= vehicles.length - 1; i++) {
                    if (vehicles[i] != null && vehicles[i].getPrice() > tempVehicle.getPrice()) {
                        tempVehicle.setPrice(vehicles[i].getPrice());
                        tempVehicle.setMake(vehicles[i].getMake());
                        tempVehicle.setModel(vehicles[i].getModel());
                    }
                }
                return tempVehicle.getMake();
            }
        }
