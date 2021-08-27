package lesson8.task4;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ValidatorStub {
    private static Set<Entity> entities = new HashSet<>();

    public static void validateEntity(Entity entity) {
        System.out.println("До валидации: " + entity);
        if (entities.contains(entity)) {
            for (Entity e : entities) {
                if (entity.equals(e)){
                    entity.uuid=e.uuid;
                }
            }
        }
        else {
            entity.setUuid(Integer.toString(new Random().nextInt(100)));
            entities.add(entity);
        }
        System.out.println("После валидации: " + entity);
        System.out.println(""); // добавил для удобства чтения
    }
}