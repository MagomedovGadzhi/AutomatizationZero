package lesson10.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalaryDocument implements Generatable, Save {
    private List<Employee> employees = new ArrayList<>();
    private String uuid;
    private String operationTime;
    private Double totalSalary = 0d;

    public String getOperationTime() {
        return operationTime;
    }

    public Double getTotalSalary() {
        return totalSalary;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public SalaryDocument generate() {
        for (int i = 0; i < Property.SALARY_EMPLOYEE_COUNT; i++) {
            Employee employee = new Employee();
            this.employees.add(employee);
            this.totalSalary += employee.getSalary();
        }
        this.uuid = StringGenerator.generateUuid();
        this.operationTime = new SimpleDateFormat(Property.SALARY_DATE_FORMAT).format(new Date().getTime() + 86_400_000);
        DocumentQueue.addSalaryDocument(this);
        return this;
    }

    @Override
    public void save() throws IOException {
        byte[] content = this.toString().getBytes();
        Files.write(Property.SALARY_OUTPUT_FILE, content);
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Зарплатная ведомость.").append(System.lineSeparator())
                .append("uuid: ").append(uuid).append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Время операции: ").append(operationTime).append(".").append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Список сотрудников:").append(System.lineSeparator());
        for (Employee employee : employees) {
            builder.append(employee).append(System.lineSeparator());
        }
        builder.append("Общая сумма: ").append(String.format("%.2f", totalSalary))
                .append(System.lineSeparator());
        ;
        return builder.toString();
    }
}