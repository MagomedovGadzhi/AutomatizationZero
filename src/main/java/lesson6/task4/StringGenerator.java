package lesson6.task4;

import java.util.Random;

public class StringGenerator {
    private static final String NUMBERS = "0123456789";
    private static final String RUSSIAN_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String RANDOM_SYMBOLS = "QAZXSWEDCVFRTGBNHYUJMKILOP0123456789";

    public static String generate(IdentityDocumentType documentType) {
        switch (documentType) {
            case MILITARY_ID:
                return generateMilitaryId();
            case DIPLOMATIC_PASSPORT:
                return generateDiplomaticId();
            case FOREIGN_PASSPORT:
                return generateForeignPassportId();
            case RUSSIAN_PASSPORT:
                return generateRussianPassportId();
            case RUSSIAN_INTERNATIONAL_PASSPORT:
                return generateRussianInternationalPassportId();
            default:
                throw new IllegalArgumentException("Неизвестный тип документа");
        }
    }

    private static String generateMilitaryId() {
        StringBuilder militaryId = new StringBuilder();
        militaryId.append(generateRandomString(RUSSIAN_ALPHABET, 2));
        militaryId.append(" ");
        if (50 > new Random().nextInt(100)) {
            militaryId.append(generateRandomString(NUMBERS, 1));
        }
        militaryId.append(generateRandomString(NUMBERS, 6));
        return militaryId.toString();
    }

    private static String generateDiplomaticId() {
        StringBuilder diplomaticId = new StringBuilder();
        diplomaticId.append(generateRandomString(NUMBERS, 2));
        diplomaticId.append(" ");
        diplomaticId.append(generateRandomString(NUMBERS, 7));
        return diplomaticId.toString();
    }

    private static String generateForeignPassportId() {
        StringBuilder foreignPassportId = new StringBuilder();
        foreignPassportId.append(generateRandomString(RANDOM_SYMBOLS, 25));
        return foreignPassportId.toString();
    }

    private static String generateRussianPassportId() {
        StringBuilder russianPassportId = new StringBuilder();
        russianPassportId.append(generateRandomString(NUMBERS, 2));
        russianPassportId.append(" ");
        russianPassportId.append(generateRandomString(NUMBERS, 2));
        russianPassportId.append(" ");
        russianPassportId.append(generateRandomString(NUMBERS, 6));
        return russianPassportId.toString();
    }

    private static String generateRussianInternationalPassportId() {
        StringBuilder russianInternationalPassportId = new StringBuilder();
        russianInternationalPassportId.append(generateRandomString(NUMBERS, 2));
        russianInternationalPassportId.append(" ");
        russianInternationalPassportId.append(generateRandomString(NUMBERS, 7));
        return russianInternationalPassportId.toString();
    }

    private static String generateRandomString(String symbolsType, int count) {
        StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            tempString.append(symbolsType.charAt(new Random().nextInt(symbolsType.length())));
        }
        return tempString.toString();
    }
}