package lesson2.task8;

public class SwitchWithoutBreaks {
    public static void main(String[] args) {
        SwitchWithoutBreaks example = new SwitchWithoutBreaks();
        example.printA(-1);
        example.printA(2);
        example.printA(4);
        example.printA(7);
        example.printA(0);
    }

    public void printA(int n) {
        switch (n) {
            default:
                System.out.print("A");
            case 4:
                System.out.print("A");
            case 3:
                System.out.print("A");
            case 2:
                System.out.print("A");
            case 1:
                System.out.print("A");
        }
        System.out.println(); //для удобства чтения результата.
    }
}