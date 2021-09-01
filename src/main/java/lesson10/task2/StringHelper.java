package lesson10.task2;

import java.util.Random;

public class StringHelper {
    public static String generate() {
        StringBuilder lineSB = new StringBuilder();
        int linesLength = new Random().nextInt(Config.LINES_MIN_LENGTH) - Config.LINES_MIN_LENGTH + 1 + Config.LINES_MAX_LENGTH;
        for (int i = 0; i < linesLength; i++) {
            lineSB.append(Config.LINES_PATTERN.charAt(new Random().nextInt(Config.LINES_PATTERN.length())));
        }
        System.out.printf(Config.LINES_MESSAGE, lineSB.toString());
        return lineSB.toString();
    }
}