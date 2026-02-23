class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("An animal makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); 
    }

    @Override
    public void speak() {
        System.out.println(name + " barks.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " meows.");
    }
}

public class Task07 {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        animal.speak();
        dog.speak();
        cat.speak();
    }
}