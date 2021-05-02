package lesson2.task3;

public class PhoneNumber {
    public static void main(String[] args) {
        String[] phoneNumbers = {"+7(910)423-73-12", "7(910)423-73-12", "89215310934",
                "+5(911)310-12-74", "+7(9fg)125-42-99", "+7(122)2342343"};
        PhoneNumber phoneNumber = new PhoneNumber();

 /*
        for (String getNumber : phoneNumbers){
            System.out.println(phoneNumber.validatePhoneNumberByRegex(getNumber));
        }
*/
        for (String getNumber : phoneNumbers){
            System.out.println(phoneNumber.validatePhoneNumberByCycle(getNumber));
        }

    }

    public boolean validatePhoneNumberByRegex (String numberExample){
        return numberExample.matches("^[+][7][(]\\d{3}[)]\\d{3}[-]\\d{2}[-]\\d{2}");
    }

    public boolean validatePhoneNumberByCycle (String phoneNumberExample){
        if (phoneNumberExample.length() != 16) return false;
        if (!phoneNumberExample.startsWith("+7(")) return false;
        if (phoneNumberExample.charAt(6) != ')') return false;
        if (phoneNumberExample.charAt(10) != '-' || phoneNumberExample.charAt(13) != '-') return false;

        int [] indexOfNumbers = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15};
        for (int index : indexOfNumbers){
            if (!Character.isDigit(phoneNumberExample.charAt(index))) return false;
        }

        return true;
    }
}
