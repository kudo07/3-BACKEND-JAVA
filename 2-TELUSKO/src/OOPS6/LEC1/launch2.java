package OOPS6.LEC1;
class Calc{
//    instance variable
    int num1;
    int num2;
    void add(){
//        local variable
        num1=10;
        num2=20;
        int res=num1+num2;
        System.out.println(res);
    }
}
public class launch2 {
    public static void main(String[] args) {
        Calc c=new Calc();
        c.add();
    }
}
