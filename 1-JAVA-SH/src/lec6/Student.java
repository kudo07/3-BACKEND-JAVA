package lec6;
import lec6.Employee;

public class Student {
    public static void main(String[] args) {
        Employee empObject=new Employee();
        empObject.empId=10;
        System.out.println(empObject.empId);
        //20
    }
    private static void modify(Employee employee){
        // is a class type
        employee.empId=20;
    }
}
