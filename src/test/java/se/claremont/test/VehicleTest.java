package se.claremont.test;

import org.junit.Test; //Importera klassen Test från org.junit

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    @Test
    public void changeOwnerOfVehicle(){

        Vehicle myVehicle = new Vehicle("Ford", "Focus");
        // Skapar ett objekt av typen Vehicle, deklarerat plus instaniserat
        myVehicle.changeOwnership("Gurra");

        assertEquals("Gurra",myVehicle.getOwner());
    }



}
