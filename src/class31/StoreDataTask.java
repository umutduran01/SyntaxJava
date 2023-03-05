package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class StoreDataTask {
    public static void main(String[] args) throws IOException {

        String path = "Files/task.properties";

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        Properties properties = new Properties();

        properties.setProperty("Red", "Apple");
        properties.setProperty("Green", "Avocado");
        properties.setProperty("Yellow", "Banana");

        properties.store(fileOutputStream, "Umut Duran");
    }
}
