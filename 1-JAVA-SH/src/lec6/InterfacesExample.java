package lec6;
interface Person{
    public String profession();

    //parent
}
class Teacher implements Person{
    @Override
    public String profession(){
        return "teaching";
        //double quotess
    }
}

class Engineer implements Person{
    @Override
    public String profession(){
        return "engineer";
    }
}
public class InterfacesExample {
    public static void main(String[] args) {
        Person t=new Teacher();
        Person e=new Engineer();
        System.out.println(t.profession());
        System.out.println(e.profession());
    }
}
