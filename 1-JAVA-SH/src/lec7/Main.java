package lec7;

import lec7.salesdepartment.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.getInvoice();
        Calculation nonStaticMet = new Calculation();
        //we can access nonstatic method from object

        nonStaticMet.sum(1, 2);
        //but we access the static method from the class not from the
        // object is ignored
        //i cannot access it
        // these mehtods are associated with the class not objects

        //nonStaticMet.getPriceOfPen();
        Calculation.getPriceOfPen();
    }
}
