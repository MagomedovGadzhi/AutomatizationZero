package Lesson12.task1.helpers;

import Lesson12.task1.model.Generatable;

public interface SerializeHelper<T extends Generatable> {
    T deserialize(String data, Class<T> clazz);

    String serialize(T object);
}