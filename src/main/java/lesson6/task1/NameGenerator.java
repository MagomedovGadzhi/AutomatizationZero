package lesson6.task1;

import java.util.Random;

public class NameGenerator {

    public static String generate() {
        int length = new Random().nextInt(4) + 8;
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] c = alphabet.toCharArray();
        StringBuilder nameTemp = new StringBuilder().append(Character.toUpperCase(c[new Random().nextInt(c.length)]));
        for (int i = 0; i < length; i++) {
            nameTemp.append(c[new Random().nextInt(c.length)]);
        }
        return nameTemp.toString();
    }
}