class Animal {
    Animal() {
        System.out.println("Animals are cat, human, lion");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Human extends Animal {
    void speak() {
        System.out.println("Human speaks");
    }
}
public class code3 {   // Class name must match file name Code3.java
    public static void main(String[] args) {
        Dog m1 = new Dog();      
        Human h1 = new Human(); 
        h1.speak();
        m1.bark();
    }
}
