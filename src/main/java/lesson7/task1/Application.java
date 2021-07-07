package lesson7.task1;

public class Application {
    public static void main(String[] args) {
        MyArrayList<Integer> test = new MyArrayList<>();
        test.size();
        test.add(0, 8);
        test.add(-1, 4);
        test.add(777);
        test.contains(8);
        test.contains(5);
        test.get(-6);
        test.get(1);
        test.size();
    }
}