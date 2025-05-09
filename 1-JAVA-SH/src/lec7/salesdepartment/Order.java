package lec7.salesdepartment;

public class Order {
    public void getInvoice() {
        Invoice invoice = new Invoice();
        //        invoice.getInvoice();
        //not access in same package different class only in the same class
        //but in protected only access the protected class has access the same package sub class not the other package classes
        invoice.getInvoiceWithDataProtected();

    }

    protected void printProtectInHumanResource() {
        System.out.println("here we are not access in other packages classes only protected allow in the same package classes");
    }

    public void overRiddenMethodJobPortal() {
        System.out.println("here form order");
    }


}
