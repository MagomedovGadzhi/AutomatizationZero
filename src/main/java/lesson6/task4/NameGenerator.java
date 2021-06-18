package lesson6.task4;

import java.util.Random;

public class NameGenerator {
    private static final String LATIN_ALPHABET = "qazwsxedcrfvtgbyhnujmikolp";

    public static String generate() {
        StringBuilder randomString = new StringBuilder();
        randomString.append(Character.toUpperCase(LATIN_ALPHABET.charAt(new Random().nextInt(LATIN_ALPHABET.length()))));
        int length = 5 + new Random().nextInt(7);
        for (int i = 0; i < length; i++) {
            randomString.append(LATIN_ALPHABET.charAt(new Random().nextInt(LATIN_ALPHABET.length())));
        }
        return randomString.toString();
    }
}