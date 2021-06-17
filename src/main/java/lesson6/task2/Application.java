package lesson6.task2;

import lesson6.task2.generators.HumanGenerator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Set<Human> humans = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            humans.add(HumanGenerator.generate());
        }
        Iterator<Human> iterator = humans.iterator();
        while (iterator.hasNext()) {
            Human human = iterator.next();
            Set<PhoneType> phoneTypes = human.getPhones().keySet();
            if (phoneTypes.size() == 3) {
                System.out.printf("%s %s, возраст %d %n", human.getLastName(), human.getFirstName(), human.getAge());
            }
            // Удаляем людей, у которых есть хотя бы 1 телефон
            if (phoneTypes.size() > 0) {
                iterator.remove();
            }
        }
        System.out.println("Количество людей после удаления: " + humans.size());
    }
}