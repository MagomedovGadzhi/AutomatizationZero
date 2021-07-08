package lesson7.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws Exception {
        ThreeHashMap<Integer, Person, Passport> testThreeHashMap = new ThreeHashMap();
        for (int i = 0; i < 10; i++) {
            testThreeHashMap.put(i, new Person(), new Passport());
        }

        Map<Integer, Person> persons = new HashMap<>();
        Map<Integer, Passport> passports = new HashMap<>();
        for (int i = 10; i < 30; i++) {
            persons.put(i, new Person());
            passports.put(i + 10, new Passport());
        }

        testThreeHashMap.putAll(persons, passports);
    }
}