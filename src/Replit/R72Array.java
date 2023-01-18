package Replit;

public class R72Array {
    public static void main(String[] args) {

/*

Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x}

Print the values so the output should look like below

**Output:**

syntax


 */

        char[] arrayNew = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };

        for (int i = 0; i < arrayNew.length; i++) {
            if (i % 2 == 0){
                System.out.print(arrayNew[i]);
            }
        }
    }
}

