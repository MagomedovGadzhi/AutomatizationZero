package lesson6.task2.generators;

import java.util.Random;

public class PhoneGenerator {

    public static String generate() {
        String telefoneNumber = "+7(";
        for (int i = 0; i < 13; i++) {
            if (i == 3) telefoneNumber += ")";
            else if (i == 7) telefoneNumber += "-";
            else if (i == 10) telefoneNumber += "-";
            else telefoneNumber += new Random().nextInt(10);
        }
        return telefoneNumber;
    }
}