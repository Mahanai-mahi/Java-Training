class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

interface Pet{
    void play();
}

class Dog extends Animal implements Pet{
    public void play(){
        System.out.println("Dog is playin");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
}
public class Hybrid {
    public static void main(String[] args){
        Dog d=new Dog();
    
        d.eat();
        d.bark();
        d.play();
    }
}
