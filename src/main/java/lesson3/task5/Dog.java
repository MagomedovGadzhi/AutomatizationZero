package lesson3.task5;

public class Dog {
    String name;
    int age;

    Dog() {
        this.name = Names.getDogNames();
        this.age = (int) (Math.random() * 10);
    }
}