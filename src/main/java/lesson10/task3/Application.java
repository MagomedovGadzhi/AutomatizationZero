package lesson10.task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        FileGen fileGen = new FileGen();
        fileGen.generate();

        FileGen fileGen2 = new FileGen(1);
        fileGen2.generate();

        List<Object> extensions = new ArrayList<>();
        extensions.add("TXT");
        FileGen fileGen3 = new FileGen(1, extensions);
        fileGen3.generate();

        List<Object> sizes = new ArrayList<>();
        sizes.add(1000);
        FileGen fileGen4 = new FileGen(1, sizes);
        fileGen4.generate();
    }
}