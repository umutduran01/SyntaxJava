package class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileRead {
    public static void main(String[] args) throws IOException {

        //Location of the file that we want to read data from
        String path = "Files/config.properties";

        //A class that helps us to navigate to the folder where is stored
        FileInputStream fileInputStream = new FileInputStream(path);

        //This "properties" class will help us to read and write data to properties file.
        Properties properties = new Properties();

        //Load all data from file inside above object "properties"
        properties.load(fileInputStream);

        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));
        fileInputStream.close();
    }
}
