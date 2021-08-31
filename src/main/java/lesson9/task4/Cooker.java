package lesson9.task4;

import lesson9.task4.dishes.Food;

import java.util.ArrayList;
import java.util.List;

public class Cooker {
    private List<Food> menu = new ArrayList<>();

    public List<Food> getMenu() {
        return menu;
    }

    public void addDishToMenu(Food dish) {
        this.menu.add(dish);
    }

    public void clearMenu() {
        this.menu.clear();
    }

    public int cookingTime() {
        int cookingTime = 0;
        for (Food food : this.menu) {
            cookingTime += food.getCookingTime();
        }
        return cookingTime;
    }

    public int dishesCount() {
        return this.menu.size();
    }
}