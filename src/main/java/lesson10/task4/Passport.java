package lesson10.task4;

public class Passport implements Generatable {
    private static final String NUMBERS = "0123456789";
    private String series;
    private String number;

    public Passport() {
        this.generate();
    }

    @Override
    public Passport generate() {
        series = StringGenerator.generateString(Property.PASSPORT_SERIES_DIGITS, NUMBERS);
        number = StringGenerator.generateString(Property.PASSPORT_NUMBER_DIGITS, NUMBERS);
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %s", series, number);
    }
}