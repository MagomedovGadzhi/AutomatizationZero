package lesson7.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> personsList = new ArrayList<>();
        ArrayList<Passport> passportsList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            personsList.add(new Person());
            passportsList.add(new Passport());
        }

        ThreeHashMap<Integer, Person, Passport> testThreeHashMap = new ThreeHashMap();
        for (int i = 0; i < 10; i++) {
            testThreeHashMap.put(i, personsList.get(i), passportsList.get(i));
        }
        System.out.println(testThreeHashMap);

        Map<Integer, Person> persons = new HashMap<>();
        Map<Integer, Passport> passports = new HashMap<>();
        for (int i = 10; i < 30; i++) {
            persons.put(i, new Person());
            passports.put(i + 10, new Passport());
        }
        System.out.println(persons);
        System.out.println(passports);

        testThreeHashMap.putAll(persons, passports);

        System.out.println(testThreeHashMap);
    }
}