package class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Recap1 {
    public static void main(String[] args) throws IOException {

        //Read a file

        String path = "Files/recap1.properties";

        FileInputStream fileInputStream = new FileInputStream(path);

        Properties properties = new Properties();

        properties.load(fileInputStream);

        System.out.println(properties.get("name")); //Output is Umut

    }
}
