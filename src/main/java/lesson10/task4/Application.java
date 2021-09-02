package lesson10.task4;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        SalaryDocument salaryDocument1 = new SalaryDocument();
        salaryDocument1.generate().save();

        SalaryDocument salaryDocument2 = new SalaryDocument();
        salaryDocument2.generate().save();

        CashDocument cashDocument = new CashDocument();
        cashDocument.generate();
        cashDocument.save();
        cashDocument.generate();
        cashDocument.save();
    }
}