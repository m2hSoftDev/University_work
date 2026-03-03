
class Beverage {
    String name;
    double price;

    Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
}

class Coffee extends Beverage {
    int caffeineLevel;

    Coffee(String name, double price, int caffeineLevel) {
        super(name, price);
        this.caffeineLevel = caffeineLevel;
    }

    void display() {
        System.out.println("Coffee Information:");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Caffeine Level: " + caffeineLevel + " mg");
    }
}

class Soda extends Beverage {
    String diet;

    Soda(String name, double price, String diet) {
        super(name, price);
        this.diet = diet;
    }

    void display() {
        System.out.println("\nSoda Information:");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Diet: " + diet);
    }
}

public class task6 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Espresso", 3.5, 80);
        Soda soda = new Soda("Coca-Cola", 1.99, "No");

        coffee.display();
        soda.display();
    }
}