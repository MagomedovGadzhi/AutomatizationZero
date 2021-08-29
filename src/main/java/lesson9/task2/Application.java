package lesson9.task2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Generator.generate());
        }

        for (Object o : list){
            Action.execDrawOrMove(o);
        }
    }
}