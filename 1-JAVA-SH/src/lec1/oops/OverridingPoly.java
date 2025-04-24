package lec1.oops;
//Overriding or run time
class Ani {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
// Child class 1
class D extends Ani {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Ani{
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class OverridingPoly {
    public static void main(String[] args) {
        Ani a1=new D();
        Ani a2= new Cat();
a1.sound();
a2.sound();
    }
}
