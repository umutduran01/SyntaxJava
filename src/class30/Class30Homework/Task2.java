package class30.Class30Homework;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {

        /*
        Create a Person class with following private fields: name, lastName, age, salary.
        Variables should be initialized through constructor.
        Inside the class also create a method to print user details.
        In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details
        */
}

class Person {
    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void print() {
        System.out.println("Name and Surname : " + name + lastName + " ," + "age is :" + age + " and " + "salary is :" + salary);

    }
}

class Test {
    public static void main(String[] args) {

        Map<Integer, Person> personMap = new TreeMap<>();
        personMap.put(1, new Person("George", "Michael", 29, 70000));
        personMap.put(2, new Person("Adam", "Smith", 69, 100000));
        personMap.put(3, new Person("Paul", "Walker", 41, 59000));

        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            System.out.println(entry.getKey());

            Person person = entry.getValue();
            person.print();
        }


    }
}
