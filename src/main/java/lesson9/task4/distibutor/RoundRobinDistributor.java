package lesson9.task4.distibutor;

import lesson9.task4.Cooker;

import java.util.List;

public class RoundRobinDistributor extends Distributor implements CookChooser {
    private static int cookerNumber=0;

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        if (cookerNumber >= cookers.size()){
            cookerNumber=0;
        }
        Cooker cooker = cookers.get(cookerNumber);
        cookerNumber++;
        return cooker;
    }
}