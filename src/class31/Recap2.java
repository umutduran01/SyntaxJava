package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Recap2 {
    public static void main(String[] args) throws IOException {

        //Write a file.

        String path = "Files/recap2.properties";

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        Properties properties = new Properties();

        properties.setProperty("english", "hello");
        properties.setProperty("spanish", "hola");

        properties.store(fileOutputStream, "Umut Duran");
    }
}
