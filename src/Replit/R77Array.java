package Replit;

import java.util.Scanner;

public class R77Array {
    public static void main(String[] args) {

/*

Create an array of integers that will store 5 elements taken from a user

Don't print any prompt message for the user

Then print out all the elements you have created in the first loop in reverse order.

**Example:**

```
Input:

1
2
3
4
5

Output:

5
4
3
2
1


 */

        int[] arr = new int[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        for (int a = 4; a >= 0; a--) {
            System.out.println(arr[a]);
        }

    }
}

