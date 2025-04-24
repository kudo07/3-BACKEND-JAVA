package lec1.oops;
class Engine{
    void start(){
        System.out.println();
    }
}
class Carr{
    //has a relationship
    private Engine engine=new Engine();

    void drive(){
        engine.start();
        System.out.println("car is driving");
    }
}
public class HasARealtionship {
    public static void main(String[] args) {
        Carr car=new Carr();
        car.drive();
    }
}
