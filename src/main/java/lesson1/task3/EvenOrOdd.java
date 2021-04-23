package lesson1.task3;

public class EvenOrOdd {
    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();

        System.out.println(evenOrOdd.isEvenOrOdd(14));
        System.out.println(evenOrOdd.isEvenOrOdd(19));

    }

    public boolean isEvenOrOdd (int n){
        return n % 2 > 0;
    }
}
