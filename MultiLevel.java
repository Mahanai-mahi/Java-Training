class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class puppy extends Dog{
    void play(){
        System.out.println("Puppy is playing");
    }
}

public class MultiLevel {
    public static void main(String[] args){
        puppy p=new puppy();
        p.play();
        p.bark();
        p.eat();
    }
}
