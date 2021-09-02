package lesson10.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;
import java.util.TreeMap;

public class CashDocument implements Generatable, Save {
    private String uuid;
    private SalaryDocument salaryDocument;
    private Map<Double, Integer> cashNominalAndCount = new TreeMap<>();

    @Override
    public CashDocument generate() {
        this.uuid = StringGenerator.generateUuid();
        this.salaryDocument = DocumentQueue.getSalaryDocument();
        Double totalSalary = this.salaryDocument.getTotalSalary();
        for (Double nominal : Property.CASH_NOMINALS) {
            int nominalCount = 0;
            nominalCount = (int) (totalSalary / nominal);
            totalSalary -= nominalCount * nominal;
            cashNominalAndCount.put(nominal, nominalCount);
        }
        return this;
    }

    @Override
    public void save() throws IOException {
        byte[] content = this.toString().getBytes();
        Files.write(Property.CASH_OUTPUT_FILE, content);
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Заявка на выдачу средств из кассы.").append(System.lineSeparator())
                .append("uuid: ").append(uuid).append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Обоснование: Зарплатная ведомость ").append(salaryDocument.getUuid()).append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Время операции: ").append(salaryDocument.getOperationTime()).append(".").append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Сумма операции: ").append(String.format("%.2f", salaryDocument.getTotalSalary()))
                .append(System.lineSeparator());
        for (Map.Entry<Double, Integer> entry : cashNominalAndCount.entrySet()) {
            builder.append(String.format("%.2f - %d шт.%n", entry.getKey(), entry.getValue()));
        }
        builder.append(System.lineSeparator());
        return builder.toString();
    }
}