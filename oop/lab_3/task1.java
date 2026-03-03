
class Vehicle {
    String makeBy;
    int makingYear;

    Vehicle(String makeBy, int makingYear) {
        this.makeBy = makeBy;
        this.makingYear = makingYear;
    }

    void displayInfo() {
        System.out.println("Make: " + makeBy);
        System.out.println("Year: " + makingYear);
    }

}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String makeBy, int makingYear, int numberOfDoors) {
        super(makeBy, makingYear);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayInfo() {
        System.out.println("Car Information:");
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
       
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String makeBy, int makingYear, boolean hasSidecar) {
        super(makeBy, makingYear);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void displayInfo() {
        System.out.println("\nMotorcycle Information:");
        super.displayInfo();
        System.out.println("Has sidecar: " + hasSidecar);
    }
}

public class task1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2002, 4);
        Motorcycle bike = new Motorcycle("Harley-Davidson", 2003, true);

        car.displayInfo();
        bike.displayInfo();
    }
}