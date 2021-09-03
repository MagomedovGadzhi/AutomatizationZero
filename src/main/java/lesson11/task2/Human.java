package lesson11.task2;

public class Human {
    private String firstName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String regex = "^[А-Я][а-я]{2,11}$";
        if (firstName.matches(regex))
            this.firstName = firstName;
        else throw new IllegalArgumentException("Некорректное имя: " + firstName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Некорректный возраст: " + age);
        }
        this.age = age;
    }
}