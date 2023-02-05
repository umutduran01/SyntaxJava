package class19.Class19Homework;

//Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.

public class A {

    String classNameA = "A";
}

class B extends A {

    int classNameB = 2;

}

class C extends B {

    char classNameC = 'C';
}