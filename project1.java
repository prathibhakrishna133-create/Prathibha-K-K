abstract class Employee {
    protected String name;
    protected double baseSalary;

    // Constructor
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void displayDetails(String role, double finalSalary) {
        System.out.println("\nPayroll Details:");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Final Salary: " + finalSalary);
    }
}

// Subclass Manager
class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateSalary() {
        return baseSalary + 5000; // bonus
    }
}

// Subclass Staff
class Staff extends Employee {

    Staff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateSalary() {
        return baseSalary; // no bonus
    }
}

// Main class
public class project1 {
    public static void main(String[] args) {

        Manager m = new Manager("Jayanth", 50000);
        Staff e1 = new Staff("Manish", 20000);
        Staff e2 = new Staff("Prathibha", 22000);

        double managerSalary = m.calculateSalary();
        double emp1Salary = e1.calculateSalary();
        double emp2Salary = e2.calculateSalary();

        m.displayDetails("Manager", managerSalary);
        e1.displayDetails("Employee 1", emp1Salary);
        e2.displayDetails("Employee 2", emp2Salary);
    }
}

