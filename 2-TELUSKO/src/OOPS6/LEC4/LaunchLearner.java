package OOPS6.LEC4;
class Learner{
//    step -1 restric data type private
    private int id;
    private String name;
    private String city;
    void setId(int id){
        id=id;

//        this is shadowing problem
//        this.id=id**
    }
    void setName(String name){
        name=name;
//        this.name=name
    }
    void setCity(String city){
        city=city;
//        this.city=city
//       this will run
//        instance variable assigning local variable
//        shaodwing problem in the setter
//        compiler is confuse so name=name what to assign so return default values 0 for int and null for string
//        jvm go to abiguity mode
    }
    String getName(){
        return city;
    }
    int getId(){
        return id;
    }
    String getCity(){
        return city;
    }

}
public class LaunchLearner {
    public static void main(String[] args) {
        Learner learner=new Learner();
        learner.setCity("al");
        learner.setId(1);
        learner.setName("lklk");
//
        String name=learner.getName();
        int id= learner.getId();
        String city=learner.getCity();
        System.out.println("name"+name);
//        null
        System.out.println(learner.getCity());
//        null

    }

}
//0 for int and null for String), because the instance variables were never updated.