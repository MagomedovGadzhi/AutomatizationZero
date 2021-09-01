package lesson10.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileHelper {
    public static void write(List<String> content) throws IOException {
        Path path = Paths.get(Config.OUTPUT_LINES);
        Files.write(path, content);
    }
}