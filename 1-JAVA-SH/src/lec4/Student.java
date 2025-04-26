package lec4;

public class Student {
    public static void main(String[] args) {
        Employee object1=new Employee(2);
        //2
        //both have their own copy variabel both have different address
        Employee object2=new Employee(4);
        //5
        System.out.println(object1.dummyMethod(2,3));
        //5
        //if we want to access the static variable then static variale associated ith the class not the
        //
    }
}
