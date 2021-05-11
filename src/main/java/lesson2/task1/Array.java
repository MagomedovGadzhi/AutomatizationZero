package lesson2.task1;

public class Array {
    public static void main(String[] args) {
        String[] words = {"Пятница", "это", "лучший", "день", "недели"};
        Array array = new Array();
        array.printByCycleFor(words);
        array.printByCycleForEach(words);
        array.printByCycleWhile(words);
    }

    public void printByCycleFor(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (index == array.length - 1) {
                System.out.println(array[index] + ".");
            } else {
                System.out.print(array[index] + " ");
            }
        }
    }

    public void printByCycleForEach(String[] array) {
        int index = 0;
        for (String word : array) {
            if (index == array.length - 1) {
                System.out.println(word + ".");
            } else System.out.print(word + " ");
            index++;
        }
    }

    public void printByCycleWhile(String[] array) {
        int index = 0;
        while (index < array.length) {
            if (index == array.length - 1) {
                System.out.println(array[index] + ".");
            } else System.out.print(array[index] + " ");
            index++;
        }
    }
}