class Animal{
    Animal(){
        System.out.println("cat");
    }
}
    class dog extends Animal{
        void bark(){
        System.out.println("meow");
    }
    }
class code01{
    public static void main(String[] args) {
        dog dg=new dog();
        dg.bark();
    }
}