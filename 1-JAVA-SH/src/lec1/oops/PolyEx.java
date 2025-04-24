package lec1.oops;
//OverLoadin or Compile time

class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class PolyEx {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println("Add 2 ints: " + calc.add(5, 10));
        System.out.println("Add 3 ints: " + calc.add(1, 2, 3));
    System.out.println("Add 2 doubles: " + calc.add(4.5, 6.7));

    }
}
// overloading won't work
//same param or different return type
//int add(int a, int b) { ... }
//double add(int a, int b) { ... }
//overloading work with different return type with different params