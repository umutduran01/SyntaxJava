package Replit;

public class R164Overriding {
    /*
    Create a method hello() in parent class that will print "method in Parent class" then override that method in 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"

    In Main Class create 3 object of the child classes and store in into an array and call method hello():

    **Expected Output:**

    method in Child1 class
    method in Child2 class
    method in Child3 class
     */

    public static void main(String[] args) {
        Child6 newTest1 = new Child6();
        Child6a newTest2 = new Child6a();
        Child6b newTest3 = new Child6b();

        newTest1.hello();
        newTest2.hello();
        newTest3.hello();

    }
}

class Parent6 {
    void hello() {
        System.out.println("method in Parent class");
    }
}

class Child6 extends Parent6 {
    void hello() {
        System.out.println("method in Child1 class");
    }
}

class Child6a extends Parent6 {
    void hello() {
        System.out.println("method in Child2 class");
    }
}

class Child6b extends Parent6 {
    void hello() {
        System.out.println("method in Child3 class");
    }
}