package LEC1;
class Student{
    int age;
    int id;
    String name;
    void studying(){
        System.out.println("Student is studying");
    }
}
public class launch1 {
//same name as file name
    public static void main(String[] args) {
//        where there is a class create the object is compulsory
    Student st = new Student();
//    new keyword to create the instance
//        object createion / instantiation of a class
    st.studying();
    }

}
