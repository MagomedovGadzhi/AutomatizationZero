package Lesson12.task2;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Helper {
    public static String getJsonArrayFromXls(String path, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(path));
        Workbook workbookXls = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbookXls.getSheet(sheetName);
        List<Map<String, String>> data = getSheetFromXls(sheet);

        return new Gson().toJson(data);
    }

    public static String getXmlFromXls(String path, String sheetName) throws IOException {
        InputStream stream = new FileInputStream(new File(path));
        Workbook workbook = new XSSFWorkbook(stream);
        Sheet sheet = workbook.getSheet(sheetName);
        final List<Map<String, String>> data = getSheetFromXls(sheet);

        XmlMapper mapper = new XmlMapper();
        return mapper.writeValueAsString(data);
    }

    private static List<Map<String, String>> getSheetFromXls(Sheet sheet) {
        List<String> keysXls = new ArrayList<>();
        List<Map<String, String>> dataXls = new ArrayList<>();

        Row firstRow = sheet.getRow(0);
        for (Cell key : firstRow) {
            keysXls.add(key.getStringCellValue());
        }

        boolean areThisFirstRow = true;
        for (Row row : sheet) {
            int indexKeys = 0;
            if (areThisFirstRow) areThisFirstRow = false;
            else {
                Map<String, String> rowXls = new TreeMap<>();
                for (Cell cell : row) {
                    rowXls.put(keysXls.get(indexKeys++), cell.getStringCellValue());
                }
                dataXls.add(rowXls);
            }
        }
        return dataXls;
    }
}