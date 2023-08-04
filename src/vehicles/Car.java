package vehicles;

public class Car extends Vehicle{

    private int numberOfDoors;


    public Car(String make, int year, int numberOfDoors) {
        super(make, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        System.out.println("make= "+ super.getMake() +" ,year= "+super.getYear()+" ,numberOfDoors= "+this.numberOfDoors);
    }
}
