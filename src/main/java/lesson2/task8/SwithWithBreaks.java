package lesson2.task8;

public class SwithWithBreaks {
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
                break;
            case (2):
                System.out.println("AA");
                break;
            case (3):
                System.out.println("AAA");
                break;
            case (4):
                System.out.println("AAAA");
                break;
            default:
                System.out.println("AAAAA");
                break;
        }
    }
}