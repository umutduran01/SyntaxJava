package class12;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {

        /*
        Store username, password and confirm password from a user and check following requirements:

        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String userame = input.next();
        System.out.print("Please enter your password: ");
        String password = input.next();
        System.out.print("Please confirm your password: ");
        String passwordConfirm = input.next();


        if (userame.isEmpty() || password.isEmpty()){
            System.out.println("Username and Password cannot be empty.");
        } else if (password.length() < 8) {
            System.out.println("Password is too short.");
        } else if (password.contains(userame)) {
            System.out.println("Password cannot contain username.");
        }else if (!password.equals(passwordConfirm)) {
            System.out.println("Passwords do not match");
        }else {
            System.out.println("Your username and password has been created");
        }



    }
}
