class Animal {
    void show() {
        System.out.println("This is an animal");
    }
}

class Mammals extends Animal {
    void legs() {
        System.out.println("Mammals have four legs");
    }
}

class Humans extends Animal {
    void type() {
        System.out.println("Humans walk on two legs");
    }
}

public class code2  {
    public static void main(String[] args) {
        Mammals m = new Mammals();
        m.show();
        m.legs();

        Humans h = new Humans();
        h.show();
        h.type();
    }
}
