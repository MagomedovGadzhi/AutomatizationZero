package lesson11.task4;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileHelper {
    public static List<Person> getPersonsFromExcel(String path, String sheetName) {
        List<Person> persons = new ArrayList<>();
        try (FileInputStream inputStream = new FileInputStream(new File(path))) {
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheet(sheetName);
            for (Row row : sheet) {
                try {
                    String lastName = row.getCell(0).getRichStringCellValue().getString();
                    String firstName = row.getCell(1).getRichStringCellValue().getString();
                    String patronymic = row.getCell(2).getRichStringCellValue().getString();
                    SimpleDateFormat format = new SimpleDateFormat("DD.mm.yyyy");
                    Date birthDate = format.parse(row.getCell(3).getStringCellValue());
                    int series = Integer.parseInt(row.getCell(4).getRichStringCellValue().getString());
                    int number = Integer.parseInt(row.getCell(5).getRichStringCellValue().getString());
                    Passport passport = new Passport(series, number);
                    Person person = new Person(lastName, firstName, patronymic, birthDate, passport);
                    persons.add(person);
                } catch (ParseException ignore) {
                }
            }
        } catch (IOException | NullPointerException e) {
            return null;
        }
        return persons;
    }
}