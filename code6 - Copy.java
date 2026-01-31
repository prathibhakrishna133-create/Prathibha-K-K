class Animal{
     void run(){
        System.out.println("Cat");
    }
}
class Cat extends Animal{
     Cat(){
        super.run();
    }
     void Sound(){
        System.out.println("meow meow");
     }
    
    }
class code6{
     public static void main(String[] args) {
        Cat ca=new Cat();
        ca.Sound();
    }
}