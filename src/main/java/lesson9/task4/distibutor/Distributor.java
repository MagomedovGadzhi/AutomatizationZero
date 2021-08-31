package lesson9.task4.distibutor;

import lesson9.task4.Cooker;
import lesson9.task4.dishes.Food;

import java.util.List;

public abstract class Distributor implements CookChooser {

    public void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addDishToMenu(food);
    }
}