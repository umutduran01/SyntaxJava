package class11.Class11Homework;

public class Grades {
    public static void main(String[] args) {

        /*
        Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        Then your program should print name of the students that has A and B grade
         */

        String[][] school = {{"George", "Michael", "Shaq", "O'neal"}, {"A", "B", "C", "D"}};

        for (int i = 0; i < school[0].length; i++) {
            for (int j = 0; j < school[1].length; j++) {
                if (i == 0 & j == 0) {
                    System.out.println("Your grade is A " + school[i][j]);
                } else if (i == 0 & j == 1) {
                    System.out.println("Your grade is B " + school[i][j]);
                }
            }

        }
    }
}
