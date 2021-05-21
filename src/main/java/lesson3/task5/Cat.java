package lesson3.task5;

public class Cat {
    String name;
    int age;

    Cat() {
        this.name = Names.getCatNames();
        this.age = (int) (Math.random() * 10);
    }
}