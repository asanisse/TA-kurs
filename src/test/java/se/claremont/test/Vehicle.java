package se.claremont.test; //motsvarar folderstrukturen

public class Vehicle {
    private String make;
    private String model;


    private int price;
    private String owner;

    public Vehicle(String make, String model){ //Konstruktor, metod med samma namn som klassen
        this.make = make;
        this.model = model;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setMake(String make){this.make=make;}

    public String getMake(){return make;}

    public void setModel(String model){this.model=model;}
    public String getModel(){return model;}

    public void changeOwnership(String newOwner){
        owner=newOwner;
    }

    public String getOwner(){
        return owner;
    }
}
