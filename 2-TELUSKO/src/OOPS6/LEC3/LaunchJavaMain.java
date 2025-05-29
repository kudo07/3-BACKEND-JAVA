package OOPS6.LEC3;

public class LaunchJavaMain {
//    syntax wise java dont give compile time error
//    java compiler allowing this
    public static void main(String[] args) {
        System.out.println("1");
        main(44);
//        other method we have to call jvm invoke the string args one
    }
    public static void main(int arg) {

        System.out.println("2");
    }
    public static void main(int[] args) {

        System.out.println("3");
    }
    public static void main(String name, int age) {

        System.out.println("4");
    }
}
//prints 1
//jvm invoke that main method which have string of args[]