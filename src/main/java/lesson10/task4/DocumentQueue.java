package lesson10.task4;

import java.util.ArrayList;
import java.util.List;

public class DocumentQueue {
    private static final List<SalaryDocument> SALARY_DOCUMENTS = new ArrayList<>();

    public static SalaryDocument getSalaryDocument() {
        if (SALARY_DOCUMENTS.size() == 0){
            System.out.println("Нет документов в очереди");
            throw new NullPointerException();
        }
        else {
            SalaryDocument salaryDocument = SALARY_DOCUMENTS.get(0);
            SALARY_DOCUMENTS.remove(0);
            return salaryDocument;
        }
    }

    public static void addSalaryDocument(SalaryDocument salaryDocument) {
        SALARY_DOCUMENTS.add(salaryDocument);
    }
}