package class15;

public class EmailMethod {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */

    String createEmail(String userName, String lastName, String emailType) {
        return (userName + lastName + '@' + emailType + ".com").toLowerCase();
    }

    public static void main(String[] args) {

        EmailMethod email = new EmailMethod();

        String myEmail = email.createEmail("Umut", "Duran", "gmail");
        System.out.println(myEmail);
    }
}

