package lec7.HumanResource;

public class Application {
    public void getSystemDefinedMethod(){
        //1. system defiend method
        double a=Math.sqrt(25);
        System.out.println(a);
    }
    //2. OVEROADING METHOD
    public void getOverloaded(){
        System.out.println("here");
    }
    public void getOverloaded(int a , String b){
        System.out.println("there");
    }
}
