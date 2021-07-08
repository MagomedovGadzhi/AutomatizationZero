package lesson7.task2;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class ThreeHashMap<K, V1, V2> extends HashMap {
    private HashMap<K, V1> firstMap = new HashMap<>();
    private HashMap<K, V2> secondMap = new HashMap<>();

    @Override
    public int size() {
        return firstMap.size();
    }

    @Override
    public boolean isEmpty() {
        return firstMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return firstMap.containsKey(key);
    }

    public boolean containsValue1(Object value) {
        return firstMap.containsValue(value);
    }

    public boolean containsValue2(Object value) {
        return secondMap.containsValue(value);
    }

    public Object getFirst(Object key) {
        return firstMap.get(key);
    }

    public Object getSecond(Object key) {
        return secondMap.get(key);
    }

    //Спросить про тип возвращаемого значения, возможно опечатка. Пришлось изменить название метода, чтобы избежать ошибки.
    public void removeThreeHashMap(Object key) {
        firstMap.remove(key);
        secondMap.remove(key);
    }

    @Override
    public Set keySet() {
        return firstMap.keySet();
    }

    public Collection values1() {
        return firstMap.values();
    }

    public Collection values2() {
        return secondMap.values();
    }

    public void putAll(Map<K, V1> m1, Map<K, V2> m2) {
        for (K key : m1.keySet()) {
            if (m2.containsKey(key)) {
                firstMap.put(key, m1.get(key));
                secondMap.put(key, m2.get(key));
            }
        }
    }

    //Спросить про параметры и тип возвращаемого значения, возможно опечатка. Реализовал как предпологал.
    public void put(K key, V1 value1, V2 value2) {
        firstMap.put(key, value1);
        secondMap.put(key, value2);
    }

    @Override
    public void clear() {
        firstMap.clear();
        secondMap.clear();
    }

    @Override
    public String toString() {
        return firstMap.toString() + secondMap.toString();
    }
}