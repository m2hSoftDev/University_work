class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound.");
    }

}

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }

    void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Age: " + age);
        makeSound();
    }
}

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }

    void display() {
        System.out.println("\nCat Name: " + name);
        System.out.println("Age: " + age);
        makeSound();
    }
}

public class task2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Iron", 7);
        Cat cat = new Cat("Tusk", 5);

        dog.display();
        cat.display();
    }
} 