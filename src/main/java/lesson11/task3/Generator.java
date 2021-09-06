package lesson11.task3;

import java.util.Random;

public class Generator {
    public static final String PATTERN = "QAZWSXEDCRFVTGBYHNUJMIKOLPqazwsxedcrfvtgbyhnujmikolp";

    public static int randomInteger(int start, int end) {
        return new Random().nextInt(end - start + 1) + start;
    }

    public static String randomString(int startLength, int endLength) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < randomInteger(startLength, endLength); i++) {
            line.append(PATTERN.charAt(new Random().nextInt(PATTERN.length())));
        }
        return line.toString();
    }
}