package OOPS6.LEC4;
class Dog{
    private int cost;
    private String name;
    private  String color;
//    paramterised constructor
    Dog(int cost,String name, String color){
    this.cost=cost;
    this.name=name;
    this.color=color;
}
//non paramterised constructor
    Dog(){
//        super();
        System.out.println("Zero param constructor");
        cost =34324;
        name="wfwe";
        color="Black";
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class LaunchConstructor {
    public static void main(String[] args) {
        Dog d1=new Dog(4,"wew","white");
//        pass the values int the constructor
//        did i set the values? NO
//        whose name is same as class name
        System.out.println(d1.getColor());
        System.out.println(d1.getCost());
        System.out.println(d1.getName());
//        getting error if we create d2
//        constructor means same name as class name
//        Dog d2=new Dog();
//        error due to constructor already cready and compiler doesnt creat a non new parameterised constructor
//        we have to create ourself if one constructor with param. or non param

//        zero parameterised constructor is not created here

        Dog d2=new Dog();
        System.out.println(d2.getName());

    }
}
