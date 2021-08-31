package lesson9.task4.distibutor;

import lesson9.task4.Cooker;

import java.util.List;

public interface CookChooser {
    public Cooker chooseCooker(List<Cooker> cookers);
}