
class Device {
    String brand;
    int totalUnit;

    Device(String brand, int totalUnit) {
        this.brand = brand;
        this.totalUnit = totalUnit;
    }

    
}

class Phone extends Device {
    String os;

    Phone(String brand, int totalUnit, String os) {
        super(brand, totalUnit);
        this.os = os;
    }

    void display() {
        System.out.println("Phone Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Total Unit: " + totalUnit);
        System.out.println("Operating System: " + os);
    }
}

class Laptop extends Device {
    double screenSize;

    Laptop(String brand, int totalUnit, double screenSize) {
        super(brand, totalUnit);
        this.screenSize = screenSize;
    }

    void display() {
        System.out.println("\nLaptop Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Total Unit: " + totalUnit);
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}

public class task5 {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", 150, "iOS");
        Laptop laptop = new Laptop("Dell", 125, 15.6);

        phone.display();
        laptop.display();
    }
}