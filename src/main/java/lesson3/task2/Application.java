package lesson3.task2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Cat[] catsList = new Cat[5];
        catsList[0] = new Cat(2, 5, "Барсик");
        catsList[1] = new Cat(3, 11, "Мурзик");
        catsList[2] = new Cat(7, 2, "Матильда");
        catsList[3] = new Cat(1, 3, "Леопольд");
        catsList[4] = new Cat(11, 4, "Базилио");

        String[] catsNames = {catsList[0].name, catsList[1].name, catsList[2].name, catsList[3].name, catsList[4].name};
        Arrays.sort(catsNames);

        for (String name : catsNames) {
            for (Cat example : catsList) {
                if (example.name.equals(name)) {
                    System.out.println("Имя: " + example.name + ", Возраст: " + example.age + ", Вес: " + example.weight + ".");
                }
            }
        }
    }
}