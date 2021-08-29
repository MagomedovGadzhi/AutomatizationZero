package lesson9.task1;

import lesson9.task1.cars.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            cars.add(Factory.make());
        }

        int renaultCounts = 0;
        int nissanCounts = 0;
        int mitsubishiCounts = 0;
        int mercedesCounts = 0;
        int regularCounts = 0;
        int premiumCounts = 0;

        for (Car car : cars) {
            if (car instanceof Renault) {
                renaultCounts++;
            }
            if (car instanceof Nissan) {
                nissanCounts++;
            }
            if (car instanceof Mitsubishi) {
                mitsubishiCounts++;
            }
            if (car instanceof Mercedes) {
                mercedesCounts++;
            }
            if (car instanceof Regular) {
                regularCounts++;
            }
            if (car instanceof Premium) {
                premiumCounts++;
            }
        }

        System.out.printf("Кол-во машин Renault: %d%n", renaultCounts);
        System.out.printf("Кол-во машин Nissan: %d%n", nissanCounts);
        System.out.printf("Кол-во машин Mitsubishi: %d%n", mitsubishiCounts);
        System.out.printf("Кол-во машин Mercedes: %d%n", mercedesCounts);
        System.out.printf("Кол-во машин Regular класса: %d%n", regularCounts);
        System.out.printf("Кол-во машин Premium класса: %d%n", premiumCounts);
    }
}