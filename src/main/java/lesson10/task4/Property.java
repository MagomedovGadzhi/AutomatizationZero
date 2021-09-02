package lesson10.task4;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Property {
    public static Integer EMPLOYEE_LASTNAME_LENGTH;
    public static Integer EMPLOYEE_FIRSTNAME_LENGTH;
    public static String EMPLOYEE_NAME_PATTERN;
    public static Double EMPLOYEE_SALARY_MIN;
    public static Double EMPLOYEE_SALARY_MAX;
    public static Integer PASSPORT_SERIES_DIGITS;
    public static Integer PASSPORT_NUMBER_DIGITS;
    public static String SALARY_DATE_FORMAT;
    public static Integer SALARY_EMPLOYEE_COUNT;
    public static Path SALARY_OUTPUT_FILE;
    public static Path CASH_OUTPUT_FILE;
    public static List<Double> CASH_NOMINALS;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src\\main\\java\\lesson10\\task4\\application.properties"));
        }catch (IOException e) {
            e.printStackTrace();
        }
            EMPLOYEE_LASTNAME_LENGTH = Integer.parseInt(properties.getProperty("employee.lastname.length"));
            EMPLOYEE_FIRSTNAME_LENGTH = Integer.parseInt(properties.getProperty("employee.firstname.length"));
            EMPLOYEE_NAME_PATTERN = properties.getProperty("employee.name.pattern");
            EMPLOYEE_SALARY_MIN = Double.parseDouble(properties.getProperty("employee.salary.min"));
            EMPLOYEE_SALARY_MAX = Double.parseDouble(properties.getProperty("employee.salary.max"));
            PASSPORT_SERIES_DIGITS = Integer.parseInt(properties.getProperty("passport.series.digits"));
            PASSPORT_NUMBER_DIGITS = Integer.parseInt(properties.getProperty("passport.number.digits"));
            SALARY_DATE_FORMAT = properties.getProperty("salary.date.format");
            SALARY_EMPLOYEE_COUNT = Integer.parseInt(properties.getProperty("salary.employee.count"));
            SALARY_OUTPUT_FILE = Paths.get(properties.getProperty("salary.output.file"));
            CASH_OUTPUT_FILE = Paths.get(properties.getProperty("cash.output.file"));
            String[] nominals = properties.getProperty("cash.nominals").split(",");
            CASH_NOMINALS = new ArrayList<>();
            for (int i = 0; i < nominals.length; i++) {
                CASH_NOMINALS.add(Double.parseDouble(nominals[i]));
            }
    }
}