package OOPS6.LEC2;
class CalculatorOne{
    int num1,num2,res;
//    memory already allocated in the heap num1 and num2
    void add() {
        num1 = 20;
        num2 = 20;
        res = num1 + num2;
        System.out.println("Result is:" + res);
    }
    int add(int a,int b){
//        parameter list
        num1=a;
        num2=b;
        res=num1+num2;
        System.out.println("res is :"+ res);
        return res;
    }
}
public class LaunchMethod1 {
    public static void main(String[] args) {
        CalculatorOne calci=new CalculatorOne();
        calci.add();
        calci.add(2,3);
//        passing the values arguments list
        int result=calci.add(2,2);
//        result is
    }
}
