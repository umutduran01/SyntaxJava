package class13.Class13Homework;

public class RemoveSpace {
    public static void main(String[] args) {

        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.

       String str = "Hello everyone ! How are you today ?";

       StringBuilder strNoSpace = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                continue;
            }
            strNoSpace.append(str.charAt(i));
        }
        System.out.print(strNoSpace);

    }
}
