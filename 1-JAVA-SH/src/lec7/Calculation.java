package lec7;

public class Calculation {
    int a = 10;
    static int b = 199;

    //normal method
    public int sum(int val1, int val2) {
        int total = val1 + val2;
        b = 10;
//        static method are allowed from the instance variable
        //doing some logger stuff
        System.out.println("addition" + total);
        return total;
    }

    //static method
    public static int getPriceOfPen() {
        //non static field 'a' cannot be referenced from the static context
        b = 12;

        //b is static
        //a/*/**/*/=10;
        int capPrice = 2;
        int penBodyPrice = 5;
//    non static variable and method cannot be reference here
//    int totalPenPrice=sum(capPrice,penBodyPrice);
        //non static method cannot be referenced from a static context;
        int totalPenPrice = capPrice + penBodyPrice;
        System.out.println("here access from the Calculation class");
        return totalPenPrice;
    }
}

