package lesson4.task2;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Validator {
    public static boolean validateStringForSpaces(String line) {
        int whitespacesCount = 0;
        for (char c : line.toCharArray()) {
            if (c == ' ') {
                whitespacesCount++;
            }
        }
        if (whitespacesCount == 2) {
            System.out.println("Строка соответствует формату.");
            return true;
        } else {
            System.out.println("Строка не соответствует формату.");
            return false;
        }
    }

    public static String[] stringToArray(String line) {
        System.out.println("Строка разбита на массив");
        return line.split("\\s");
    }

    public static boolean validateHuman(Human human) {
        if (human.getBirthDate() == null || human.getFirstName() == null || human.getLastName() == null) {
            System.out.println("Переменные(ая) объекта Human не инициализированы");
            return false;
        } else {
            System.out.println("Переменные объекта Human инициализированы");
            return true;
        }
    }

    public static boolean validateHumanArray(Human[] humans) {
        int count = 0;
        for (Human example : humans) {
            if (example != null) {
                count++;
            }
        }
        if (count == humans.length) {
            System.out.println("Массив объектов типа Human заполнен.");
            return false;
        } else {
            System.out.println("Массив объектов типа Human не заполнен.");
            return true;
        }
    }
}