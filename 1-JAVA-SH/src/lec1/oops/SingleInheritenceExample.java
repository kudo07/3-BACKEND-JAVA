package lec1.oops;
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking");
    }
}



public class SingleInheritenceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // inherited from Animal
        dog.bark();  // defined in Dog
    }
}
