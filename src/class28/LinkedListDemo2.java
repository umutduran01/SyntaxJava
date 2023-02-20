package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList<String> subjects = new LinkedList<>();

        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("GIT");
        subjects.add("JAVA");

        LinkedList<String> futureSubjects = new LinkedList<>();

        futureSubjects.add("Selenium");
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");

        LinkedList<String> allSubjects = new LinkedList<>();

        /*
        for (String subject : subjects){
            allSubjects.add(subject);
        }

        for (String subject : futureSubjects){
            allSubjects.add(subject);
        }

        System.out.println(allSubjects);

        */

        //There is a short way to add all elements to allSubject.

        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);

        System.out.println(allSubjects);

        LinkedList<String> subjectsILike = new LinkedList<>();

        subjectsILike.add("SDLC");
        subjectsILike.add("JAVA");
        subjectsILike.add("SQL");

        allSubjects.removeAll(subjectsILike); //We deleted the elements in subjectsILike from allSubjects
        System.out.println(subjectsILike);
        System.out.println(allSubjects);
    }
}
