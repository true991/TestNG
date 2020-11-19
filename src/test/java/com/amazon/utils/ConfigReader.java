package com.amazon.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    /**
     * The method is reading property file
     * @param filePath
     */
    public static void readProperties(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * The method returns the value of the key as a String
     * @param key
     * @return String value of the key
     */
    public static String getPropValue(String key) {
        return prop.getProperty(key);
    }
}
