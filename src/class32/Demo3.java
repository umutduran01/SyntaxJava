package class32;

import class32.utils.ConfigReader;

import java.io.IOException;
import java.util.Properties;

public class Demo3 {
    public static void main(String[] args) throws IOException {

        Properties properties = ConfigReader.read();
        System.out.println(properties.get("user"));

    }
}
