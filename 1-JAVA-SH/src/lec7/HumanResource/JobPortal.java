package lec7.HumanResource;

import lec7.salesdepartment.Invoice;
import lec7.salesdepartment.Order;

public class JobPortal {
    public void getInvoiceForMaintaingJobPortal(){
        Invoice invoice=new Invoice();
        //to access the invoice getInvoice method we need to create the object
        //invoice.getInvoice();
    //it show error make getInvoice public
        Order order = new Order();
        //  order.printProtectInHumanResource();
        //not access protec class in the different package only possible in the same package

    }
}
class AccessProtectedOrder extends Order{
    public void getAccessProtecClassOrder(){
        printProtectInHumanResource();
        //see we can access protected in the child class but not in non-child class in different package
    }
    //3. overrriden method
    @Override
    public void overRiddenMethodJobPortal(){
        System.out.println("from the overriden job portal");
    }
}
