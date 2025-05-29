package OOPS6.LEC4;
class LearnerOne{
    //    step -1 restric data type private
    private int id;
    private String name;
    private String city;
    void setId(int Id){
        id=Id;
    }
    void setName(String Name){
        name=Name;
    }
    void setCity(String City){
        city=City;
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



public class LuanchLearnerOne {
    public static void main(String[] args) {
        LearnerOne learner=new LearnerOne();
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
