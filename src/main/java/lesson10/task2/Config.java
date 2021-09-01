package lesson10.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final Properties PROPERTIES = new Properties();
    public static final String OUTPUT_LINES;
    public static final Integer LINES_AMOUNT;
    public static final Integer LINES_MAX_LENGTH;
    public static final Integer LINES_MIN_LENGTH;
    public static final String LINES_PATTERN;
    public static final String LINES_MESSAGE;

    static {
        try {
            PROPERTIES.load(new FileInputStream("src\\main\\java\\lesson10\\task2\\application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        OUTPUT_LINES = getProperty("output.file", "src\\main\\java\\lesson10\\task2\\default_output.txt");
        LINES_AMOUNT = getIntegerProperty("lines.amount", 20);
        LINES_MAX_LENGTH = getIntegerProperty("lines.max.length", 40);
        LINES_MIN_LENGTH = getIntegerProperty("lines.min.length", 20);
        LINES_PATTERN = getProperty("lines.pattern", "DEFAULT");
        LINES_MESSAGE = getProperty("lines.message", "Строка сгенерирована (default): %s%n");
    }

    private static Boolean getBooleanProperty(String key, Boolean defaultValue) {
        return Boolean.parseBoolean(PROPERTIES.getProperty(key, defaultValue.toString()));
    }

    private static Integer getIntegerProperty(String key, Integer defaultValue) {
        return Integer.parseInt(PROPERTIES.getProperty(key, defaultValue.toString()));
    }

    private static String getProperty(String key, String defaultValue) {
        return PROPERTIES.getProperty(key, defaultValue);
    }
}