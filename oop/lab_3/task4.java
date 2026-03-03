
class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    void display() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + name );
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, int employeeId, double salary, String language) {
        super(name, employeeId, salary);
        this.language = language;
    }

    void display() {
        System.out.println("\nDeveloper Information:");
        System.out.println("Name: " + name );
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
        System.out.println("Programming Language: " + language);
    }
}

public class task4 {
    public static void main(String[] args) {
        Manager manager = new Manager("Sasuke", 101, 80000.0, "HR");
        Developer developer = new Developer("Naruto", 201, 70000.0, "Java");

        manager.display();
        developer.display();
    }
}