package lec7;

public abstract class Profession {

    public final void professionMethod() {
        System.out.println("Here in the profession class");
    }

    public abstract int printO(); // Abstract method must not have a body
// declaration
}