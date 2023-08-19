package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    /**
     * This method is used to load properties from Config.properties file
     *
     * @return prop object
     */
    public Properties initProperties() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/Config/Config.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }

    public static String getProperty(String propertyName) {
        return prop.getProperty(propertyName);
    }
}
