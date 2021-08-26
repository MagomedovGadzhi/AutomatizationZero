package lesson8.task2;

import lesson8.task1.Person;

import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        for (int groupSize = 10; groupSize < 30; groupSize++) {
            int personDuplicateCount = 0;
            for (int iterationCounts = 0; iterationCounts < 100000; iterationCounts++) {
                Set<Person> persons = new HashSet<>();
                for (int k = 0; k < groupSize; k++) {
                    persons.add(new Person());
                }
                if (persons.size() != groupSize) personDuplicateCount++;
            }

            double duplicateChance = (100.0f * personDuplicateCount) / 100000;
            System.out.printf("%d: %.2f %%%n", groupSize, duplicateChance);
        }
    }
}