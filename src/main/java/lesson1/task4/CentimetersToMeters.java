package lesson1.task4;

public class CentimetersToMeters {
    public static void main(String[] args) {
        CentimetersToMeters centimetersToMeters = new CentimetersToMeters();

        System.out.println(centimetersToMeters.getCentimetersToMeters(115));
        System.out.println(centimetersToMeters.getCentimetersToMeters(800));
        System.out.println(centimetersToMeters.getCentimetersToMeters(278));
    }


    public int getCentimetersToMeters (int n ) {
        return n/100;
    }
}
