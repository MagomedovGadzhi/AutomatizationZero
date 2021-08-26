package lesson8.task3;

public enum Owners {
    QIWI("ООО «Киви»"),
    ELEKSNET("ООО «Элекснет»"),
    TINKOFF("АО «Тинькофф»");

    private String name;

    Owners(String name) {
        this.name = name;
    }
}