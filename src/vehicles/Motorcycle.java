package vehicles;

public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String make,int year,boolean hasSidecar){
        super(make,year);
        this.hasSidecar=hasSidecar;
    }

    @Override
    public void displayDetails() {
        System.out.println("make= "+ super.getMake() +" ,year= "+super.getYear()+" ,hasSidecar= "+this.hasSidecar);
    }
}
