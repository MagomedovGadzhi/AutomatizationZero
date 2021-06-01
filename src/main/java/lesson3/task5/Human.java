package lesson3.task5;

import java.util.Random;

public class Human {
    private static int humanCount = 0;
    int ID;
    String name;
    Dog[] dogsList;
    Cat[] catsList;

    Human() {
        this.name = Names.getHumanName();
        dogsList = new Dog[new Random().nextInt(4)];
        catsList = new Cat[new Random().nextInt(4)];
        for (int index = 0; index < dogsList.length; index++) {
            dogsList[index] = new Dog();
        }
        for (int index = 0; index < catsList.length; index++) {
            catsList[index] = new Cat();
        }
        humanCount++;
        ID = humanCount;
    }
}