package lesson2.task7;

public class AgeDetermination {
    public static void main(String[] args) {
        AgeDetermination example = new AgeDetermination();
        System.out.println(example.ageDetermination(32));
        System.out.println(example.ageDetermination(52));
        System.out.println(example.ageDetermination(66));
        System.out.println(example.ageDetermination(82));
        System.out.println(example.ageDetermination(25));
        System.out.println(example.ageDetermination(44));
        System.out.println(example.ageDetermination(60));
        System.out.println(example.ageDetermination(75));
        System.out.println(example.ageDetermination(22));
        System.out.println(example.ageDetermination(119));
    }

    public String ageDetermination(int age) {
        if (age >= 25 && age < 44) {
            return "молодой возраст";
        } else if (age >= 44 && age < 60) {
            return "средний возраст";
        } else if (age >= 60 && age < 75) {
            return "пожилой возраст";
        } else if (age >= 75 && age < 90) {
            return "старческий возраст";
        } else {
            return "неизвестный возраст";
        }
    }
}