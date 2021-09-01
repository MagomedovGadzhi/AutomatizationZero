package lesson10.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        List<String> content = new ArrayList<>();
        for (int i = 0; i < Config.LINES_AMOUNT; i++) {
            content.add(StringHelper.generate());
        }
        FileHelper.write(content);
    }
}