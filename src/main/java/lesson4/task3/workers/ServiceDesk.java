package lesson4.task3.workers;

public class ServiceDesk {
    private static int ticketNumber = 0;

    public static void createTicket(String description) {
        ticketNumber++;
        System.out.printf("Заявка %d была создана: %s%n", ticketNumber, description);
        description = description.toLowerCase();
        if (description.contains("справк") || description.contains("отчет") || description.contains("бюджет")) {
            Accountant.takeTicket(ticketNumber);
        } else if (description.contains("доставк") || description.contains("курьер")) {
            Logistician.takeTicket(ticketNumber);
        } else if (description.contains("компьютер") || description.contains("принтер") || description.contains("сервер")) {
            SysAdmin.takeTicket(ticketNumber);
        } else if (description.contains("уборк")) {
            Cleaner.takeTicket(ticketNumber);
        } else {
            System.out.printf("Специалист по выполнению заявки №%d не найден.%n", ticketNumber);
        }
    }
}