package lesson2.task8;

public class SwithWithoutBreaks {
    public static void main(String[] args) {
        SwithWithBreaks example = new SwithWithBreaks();
        example.printA(-1);
        example.printA(2);
        example.printA(4);
        example.printA(7);
        example.printA(0);
    }

    public void printA(int n) {
        switch (n) {
            case (1):
                System.out.println("A");
            case (2):
                System.out.println("AA");
            case (3):
                System.out.println("AAA");
            case (4):
                System.out.println("AAAA");
            default:
                System.out.println("AAAAA");
        }
    }
}