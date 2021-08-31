package lesson9.task4;

import lesson9.task4.dishes.Food;
import lesson9.task4.distibutor.BusyTimeDistributor;
import lesson9.task4.distibutor.RoundRobinDistributor;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Cooker> cookers = Generator.generateCookers(); //генерируем поваров
        List<Food> menu = Generator.generateFood();         //генерируем 100 блюд

        BusyTimeDistributor busyTimeDistributor = new BusyTimeDistributor();
        RoundRobinDistributor roundRobinDistributor = new RoundRobinDistributor();

        //распределяем блюда по системе BusyTimeDistributor
        for (Food food : menu) {
            busyTimeDistributor.addFood(food, cookers);
        }
        //высчитывыаем общее время приготовления по BusyTimeDistributor
        int cookingTime = 0;
        for (Cooker cooker : cookers) {
            if (cookingTime < cooker.cookingTime()) {
                cookingTime = cooker.cookingTime();
            }
        }
        System.out.println("Общее время приготовления всех блюд по системе \"BusyTimeDistributor\" = " + cookingTime);

        //очищаем список блюд у поваров
        for (Cooker cooker : cookers) {
            cooker.clearMenu();
        }

        //распределяем блюда по системе RoundRobinDistributor
        for (Food food : menu) {
            roundRobinDistributor.addFood(food, cookers);
        }
        //высчитывыаем общее время приготовления по RoundRobinDistributor
        cookingTime = 0;
        for (Cooker cooker : cookers) {
            if (cookingTime < cooker.cookingTime()) {
                cookingTime = cooker.cookingTime();
            }
        }
        System.out.println("Общее время приготовления всех блюд по системе \"RoundRobinDistributor\" = " + cookingTime);
    }
}