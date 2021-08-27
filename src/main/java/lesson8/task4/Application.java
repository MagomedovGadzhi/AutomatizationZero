package lesson8.task4;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Entity> entities = Arrays.asList(
                new User("Иванов", "Архитектор"),
                new User("Иванов", "Архитектор"),
                new User("Петров", "Архитектор"),
                new User("Иванов", "Инженер"),
                new Account("Номер счета", "40706810000000000000"),
                new Account("Номер счета", "40706810000000000000"),
                new Account("Номер счета ФЛ", "40706810000000000000"),
                new Account("Номер счета", "40706810000000000001"),
                new Branch("Операционный офис", "г. Москва"),
                new Branch("Операционный офис", "г. Москва"),
                new Branch("Региональный филиал", "г. Москва"),
                new Branch("Операционный офис", "г. Махачкала"),
                new Client("ООО Петрушка", "г. Москва, ул. Тверская, д. 3"),
                new Client("ООО Петрушка", "г. Москва, ул. Тверская, д. 3"),
                new Client("ООО Укроп", "г. Москва, ул. Ленина, д. 33"),
                new Client("ООО Петрушка", "г. Москва, ул. Тверская, д. 3")
        );
        for (Entity entity : entities)
            entity.validate();
    }
}