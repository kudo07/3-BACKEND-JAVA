package lec7.salesdepartment;

public class Invoice {
private void getInvoice(){
    System.out.println("inside invouce method");
    }
    public void printInvoice(){
    //since i am in the same class so npS
    getInvoice();
    }
    protected void getInvoiceWithDataProtected(){
        System.out.println("access only this package class not the other package classes only in salesdepartment package not the humanresource package");
    }
}
