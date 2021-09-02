package lesson10.task4;

import java.util.Random;

public class StringGenerator {
    private static final String UUID = "QWERTYUIOPASDFGHJKLZXCVBNMOqwertyuiopasdfghjklzxcvbnm0123456789";

    public static String generateString(Integer length, String pattern) {
        StringBuilder str = new StringBuilder();
        str.append(generateRandomString(length, pattern));
        return str.toString();
    }

    public static String generateUuid() {
        StringBuilder uuid = new StringBuilder();
        uuid.append(generateRandomString(6, UUID));
        uuid.append("-");
        uuid.append(generateRandomString(4, UUID));
        uuid.append("-");
        uuid.append(generateRandomString(4, UUID));
        uuid.append("-");
        uuid.append(generateRandomString(4, UUID));
        uuid.append("-");
        uuid.append(generateRandomString(12, UUID));
        return uuid.toString();
    }

    private static String generateRandomString(int count, String symbolsType) {
        StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            tempString.append(symbolsType.charAt(new Random().nextInt(symbolsType.length())));
        }
        return tempString.toString();
    }
}