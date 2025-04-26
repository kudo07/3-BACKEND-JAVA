package lec4;



public class Employee {
    int memeberValue;//default value is 0
    static int staticVariable=100;
    public void dummyMethodHere(){
        //method
        byte localVariable=100;
        //local Variable

    }
    //method parameter
    public int dummyMethod(int a ,int b){
        return a+b;
    }
    //parameterised contructor when the name is equal to the filename.java matches
    Employee(int b){
        //this is contructor parameterised
        System.out.println(b);
    }
    int val=10;
    int d;//0 default value
    long longvar=val;
    //automatic type casting from lower to upper data types not vice versa

    byte byteVar=(byte) val;
    // explicit typecasting
    int a;//0
    byte b;
    int c=a+b;
    byte one=1;
    byte onetwoseven=127;
    //errro not convert form int to byte loose conversation
    //byte ans=one+onetwoseven;
    int ans=one+onetwoseven;

   //wont work since range is crossing
   //byte is 1 byte 8bite -128 to 127
    public void dummyMethod(){
        byte localVariable;
        //defualt value is 0 and cannot access outside the method
        System.out.println("here");
    }
}
