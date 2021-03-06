package lesson7.task1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {

    @Override
    public int size() {
        System.out.printf("Размер списка: %d %n", super.size());
        return super.size();
    }

    @Override
    public boolean add(T t) {
        System.out.printf("Добавлен объект %s в список %n", t);
        return super.add(t);
    }

    @Override
    public boolean contains(Object o) {
        System.out.printf("Объект%s содержится в списке %n", super.contains(o) ? "" : " не");
        return super.contains(o);
    }

    @Override
    public T get(int index) {
        T object = null;
        try {
            object = super.get(index);
        } catch (IndexOutOfBoundsException exception) {
        }
        System.out.println("Получен объект " + object + " из списка");
        return object;
    }

    @Override
    public void add(int index, T element) {
        if (index >= super.size() || index<0) {
            index = 0;
        }
        super.add(index, element);
        System.out.printf("Добавлен объект %s в список на позицию %d.%n", element, index);
    }
}