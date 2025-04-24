package lec1.oops;
class AnimalIn{
    void eat(){
        System.out.println("Animal eats");
    }
}
class DogIn extends AnimalIn{
    void bark(){
        System.out.println("Dog barks");
    }
}

class Puppy extends DogIn{
    void weep(){
        System.out.println("puppy weeps");
    }
}
public class MultilpleInEx {
    public static void main(String[] args) {
        Puppy puppy=new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
