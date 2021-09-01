package lesson10.task3;

import java.nio.file.Files;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        FileGen fileGen = new FileGen();
        List<Files> files = fileGen.generate();
        for (Files file: files) {
            System.out.printf();
        }
    }
}