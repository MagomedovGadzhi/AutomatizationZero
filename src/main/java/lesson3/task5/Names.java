package lesson3.task5;

import java.util.Random;

public class Names {
    static String[] humansNames = {"Иван", "Александр", "Виталий"};
    static String[] dogsNames = {"Бобик", "Шарик", "Рекс"};
    static String[] catsNames = {"Мурзик", "Пушок", "Кузя"};

    static String getHumanName() {
        return humansNames[new Random().nextInt(humansNames.length)];
    }

    static String getDogNames() {
        return dogsNames[new Random().nextInt(dogsNames.length)];
    }

    static String getCatNames() {
        return catsNames[new Random().nextInt(catsNames.length)];
    }
}