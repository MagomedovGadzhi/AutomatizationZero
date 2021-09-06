package lesson9.task4;

import lesson9.task4.dishes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    public static List<Cooker> generateCookers() {
        List<Cooker> cookers = new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(6) + 5; i++) {
            cookers.add(new Cooker());
        }
        return cookers;
    }

    public static List<Food> generateFood() {
        List<Food> order = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    order.add(new Meat());
                    break;
                case 1:
                    order.add(new Fish());
                    break;
                case 2:
                    order.add(new Rice());
                    break;
                case 3:
                    order.add(new Buckwheat());
                    break;
                case 4:
                    order.add(new Coffee());
                    break;
                case 5:
                    order.add(new Tea());
                    break;
            }
        }
        return order;
    }
}