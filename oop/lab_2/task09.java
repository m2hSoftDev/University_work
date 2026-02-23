class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, String department) {
        super(name); 
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String language;

    public Developer(String name, String language) {
        super(name); 
        this.language = language;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + language);
    }
}

public class task09 {
    public static void main(String[] args) {
        Manager manager = new Manager("Mehedi", "CSE");
        Developer developer = new Developer("Ahsan", "Java");

        manager.displayInfo();
        developer.displayInfo();
    }
}