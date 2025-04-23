package lec1.oops;
interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
//    no override as it is not derived from the parent class
    public void horn(){
        System.out.println("bow bow");
    }
}
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }
}

public class Abstraction{
    public static void main(String[] args){
        Vehicle myCar=new Car();
        Vehicle myBike=new Bike();
        Car myCarCore=new Car();
        myCarCore.horn();
  //        bow bow
        myCar.start();
        myCar.stop();
        myBike.start();
        myBike.stop();
    }
}