package lesson1.task6;

public class Scheme {
    public static void main(String[] args) {
        Scheme scheme = new Scheme();
        System.out.println(scheme.getResult(false, false, false, false));
        System.out.println(scheme.getResult(true, true, true, true));
        System.out.println(scheme.getResult(false, true, false, true));
        System.out.println(scheme.getResult(true, false, true, false));
        System.out.println(scheme.getResult(true, true, false, false));
    }

    public boolean getResult(boolean a, boolean b, boolean c, boolean d) {
        return (a && b) && (!(c || d));
    }
}