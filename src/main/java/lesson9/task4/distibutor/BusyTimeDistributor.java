package lesson9.task4.distibutor;

import lesson9.task4.Cooker;

import java.util.List;

public class BusyTimeDistributor extends Distributor implements CookChooser {
    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int maxCookingTime = Integer.MAX_VALUE;
        Cooker fasterCooker = null;
        for (int i = 0; i < cookers.size(); i++) {
            if (cookers.get(i).cookingTime() < maxCookingTime) {
                maxCookingTime = cookers.get(i).cookingTime();
                fasterCooker = cookers.get(i);
            }
        }
        return fasterCooker;
    }
}