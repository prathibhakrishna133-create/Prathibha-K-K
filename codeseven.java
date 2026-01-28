package day2;

class Student {

    // Instance variable
    String name;

    // Constructor
    Student(String n) {
        name = n;   // assigning instance variable
    }

    void display() {
        // Local variable
        int marks = 90;

        System.out.println("Instance variable (name): " + name);
        System.out.println("Local variable (marks): " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.display();
        s2.display();
    }
}

