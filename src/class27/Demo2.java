package class27;

public class Demo2 {
    public static void main(String[] args) {

        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
        //create a method which can search a name from this array

        System.out.println(findInArray("Nima", names));

    }

    static boolean findInArray(String nameToFind, String[] namesArray) {
        for (String names : namesArray) {
            if (nameToFind.equals(names)) {
                return true;
            }
        }
        return false;
    }

}
