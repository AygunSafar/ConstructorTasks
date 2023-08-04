package vehicles;

import java.sql.SQLOutput;

public class Vehicle {

    private String make;
    private int year;

    public Vehicle(){

    }

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void displayDetails(){
        System.out.println("make= "+ this.make +" ,year= "+this.year);
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}
