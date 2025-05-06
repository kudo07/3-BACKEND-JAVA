package lec6;

public class StudenString {
    public static void main(String[] args) {
        String s1="hello";
        //in the string constant pool it put the 'hello' literal there
        String s2="hello";

        //it will check before putting 'hello' in the string constant pool if this literal there or not
        //if it is present now s2 points to the same
        String s3=new String("hello");
        System.out.println(s1==s2);
        //match with the memory
        //true
        System.out.println(s1.equals(s2));
        //equals match the content
        //true
        //check if both have same memory or not
        System.out.println(s1.equals(s3));

        //true as both have 'hello' literal
        System.out.println(s1==s3);
        //are they pointing the same memory in the heap
        //no
        //false
        //once created they cannot be changed
        //because whatever the value created through string literals
        s1="pop";
        System.out.println(s1);
        System.out.println(s1==s2);
        s3="new hello";
        System.out.println(s3);
        //new hello
        //false
    }

}
/*
Before:
1 ---> "hello"
2 ---> "hello"
3 ---> new "hello" (in heap)

fter:
1 ---> "pop"
2 ---> "hello"
3 ---> new "hello"*/

/*

SCP (String Constant Pool)
--------------------------
"hello" <--- s1, s2

Heap
--------------------------
new String("hello") <--- s3 (wraps "hello" from SCP internally)
 */