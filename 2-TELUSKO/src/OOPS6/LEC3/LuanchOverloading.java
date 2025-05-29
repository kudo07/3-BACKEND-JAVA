package OOPS6.LEC3;
//method overloading same name with different parameters list
class AdditionCacl{
    int add(int n1 , int n2){
        return n1+n2;
    }
    int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    double add(int n1, double n2){
        return n1+n2;
    }
//
    double add(int n1,double n2,double n3){
        return n1+n2+n3;
    }
    double add(double n1, double n2, double n3){
        return n1+n2+n3;
    }
//    both cases can have the power to hold mul(3,3)
//    which one give prirority
//    gives compiler time error method overloading is the compile time polymorphism
    double mul(int x, double y){
        return x*y;
    }
    double mul(double x, int y){

        return x*y;
    }

}
public class LuanchOverloading {
    public static void main(String[] args) {

    int x=10;
    int y=20;
    double a=30.5;
    double b=40.5;
    double c=50.5;
    AdditionCacl calc=new AdditionCacl();
    calc.add(x,y);
//    compile time error, compiler dont give permision to run this
//    calc.mul(3,3);
    }

}
