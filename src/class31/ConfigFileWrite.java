package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWrite {
    public static void main(String[] args) throws IOException {

        //Path where we want to create a new file and its name with extension.
        String path = "Files/test.properties";

        //We use FileOutputStream when we want to write data to a file.
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        Properties properties = new Properties();

        //We use setProperty method when we store data to a properties file.
        properties.setProperty("Name","Umut");

        //Method to store data to disk.
        properties.store(fileOutputStream,"New user created.");

    }
}
