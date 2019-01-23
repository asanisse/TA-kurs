package se.claremont.test;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GarageTest {

    @Test

    public void parkVehicleInGarage(){
        Vehicle myVehicle = new Vehicle("Ford", "Focus");
        Garage myGarage = new Garage("Testgatan 1");
        myGarage.parkVehicle(1,myVehicle );
        assertEquals(myVehicle, myGarage.checkVehicle(1));

    }

    @Test
    public void moveCarInGarage(){
        Vehicle myNewVehicle = new Vehicle("Audi", "A300");
        Garage myNewGarage = new Garage("Test Street 666");
        myNewGarage.moveCars(6, myNewVehicle);
        assertEquals(myNewVehicle,myNewGarage.checkVehicle(6) );
    }

    @Test
    public void getNumberOfExpensiveVehicles(){
        Garage myGarage = new Garage("Testgatan 1");

        Vehicle myVehicle = new Vehicle("Ford", "Focus");
        myVehicle.setPrice(1100);
        myGarage.parkVehicle(1,myVehicle );

        Vehicle myVehicle2 = new Vehicle("Volvo", "V40");
        myVehicle2.setPrice(900);
        myGarage.parkVehicle(2,myVehicle2 );

        Vehicle myVehicle3 = new Vehicle("Saab", "V50");
        myVehicle3.setPrice(750);
        myGarage.parkVehicle(3,myVehicle3 );

        Vehicle myVehicle4 = new Vehicle("Opel", "Omega");
        myVehicle4.setPrice(800);
        myGarage.parkVehicle(9,myVehicle4 );

        assertEquals(1, myGarage.getNumberOfCarsWithValueOver(1000));


    }

    @Test
    public void getMostExpensiveCarInGarage(){
        Garage myGarage = new Garage("Testgatan 1");

        Vehicle myVehicle = new Vehicle("Ford", "Focus");
        myVehicle.setPrice(1100);
        myGarage.parkVehicle(1,myVehicle );

        Vehicle myVehicle2 = new Vehicle("Volvo", "V40");
        myVehicle2.setPrice(900);
        myGarage.parkVehicle(2,myVehicle2 );

        Vehicle myVehicle3 = new Vehicle("Saab", "V50");
        myVehicle3.setPrice(1750);
        myGarage.parkVehicle(3,myVehicle3 );

        Vehicle myVehicle4 = new Vehicle("Opel", "Omega");
        myVehicle4.setPrice(1800);
        myGarage.parkVehicle(9,myVehicle4 );

       int highestPrice = 0;

       // highestPrice = myGarage.getHighestPrice(highestPrice);

        assertEquals(myVehicle4.getPrice(),highestPrice);
    }
    //Some comments
    @Test
    public void getMostExpensiveVehicleInGarage() {

        Vehicle tempVehicle = new Vehicle("Porsche", "Snabb");
        tempVehicle.setPrice(100);
        Garage myGarage = new Garage("Testgatan 1");

        Vehicle myVehicle = new Vehicle("Ford", "Focus");
        myVehicle.setPrice(1100);
        myGarage.parkVehicle(1, myVehicle);

        Vehicle myVehicle2 = new Vehicle("Volvo", "V40");
        myVehicle2.setPrice(9000);
        myGarage.parkVehicle(2, myVehicle2);

        Vehicle myVehicle3 = new Vehicle("Saab", "V50");
        myVehicle3.setPrice(1750);
        myGarage.parkVehicle(3, myVehicle3);

        Vehicle myVehicle4 = new Vehicle("Opel", "Omega");
        myVehicle4.setPrice(1800);
        myGarage.parkVehicle(9, myVehicle4);

       // assertEquals(myVehicle2.getMake(), myGarage.getMostExpensiveVehicle(tempVehicle));
         //   System.out.println("Test passed");



    }

    }
