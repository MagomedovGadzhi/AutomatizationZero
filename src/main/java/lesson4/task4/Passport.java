package lesson4.task4;

public class Passport {
    private String series;
    private String number;
    private static Passport[] oldPassports = new Passport[100];
    private static int passportCount = 0;

    Passport() {
        oldPassports[passportCount] = this;
        passportCount++;
    }

    //сеттеры
    public Passport setSeries(String series) {
        if (series.matches("^(\\d{4})$")) {
            if (this.number == null) {
                this.series = series;
                System.out.printf("Серия паспорта установлена: %s%n", series);
            } else {
                for (Passport passport : oldPassports) {
                    if (passport == null || passport == this) {
                        break;
                    }
                    if (passport.series.equals(series) && passport.number.equals(this.number)) {
                        System.out.printf("Пасспорт с серией %s и номером %s уже существует.%n", series, this.number);
                        break;
                    }
                }
                this.series = series;
                System.out.printf("Серия паспорта установлена: %s%n", series);
            }
        } else {
            System.out.println("Ошибка. Серия паспорта должна состоять из 4 цифр");
        }
        return this;
    }

    public Passport setNumber(String number) {
        if (number.matches("^(\\d{6})$")) {
            if (this.series == null) {
                this.number = number;
                System.out.printf("Номер паспорта усатновлен: %s%n", number);
            } else {
                for (Passport passport : oldPassports) {
                    if (passport == null || passport == this) {
                        break;
                    }
                    if (passport.series.equals(this.series) && passport.number.equals(number)) {
                        System.out.printf("Пасспорт с серией %s и номером %s уже существует.%n", this.series, number);
                        break;
                    }
                }
                this.number = number;
                System.out.printf("Номер паспорта усатновлен: %s%n", number);
            }
        } else {
            System.out.println("Ошибка. Номер паспорта должен состоять из 6 цифр");
        }
        return this;
    }

    //геттеры
    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }
}