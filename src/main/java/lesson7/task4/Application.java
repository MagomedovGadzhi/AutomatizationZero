package lesson7.task4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        double amount = 300_000d;
        double rate = 16.9d;
        int duration = 12;

        BaseCredit baseCredit = new BaseCredit(amount, rate, duration);
        BaseCredit differentiateCredit = new DifferentiateCredit(amount, rate, duration);
        BaseCredit annuityCredit = new AnnuityCredit(amount, rate, duration);

        List<Double> baseGraph = baseCredit.getMonthPayments();
        List<Double> difGraph = differentiateCredit.getMonthPayments();
        List<Double> baseAnnuit = annuityCredit.getMonthPayments();

        System.out.println("№: Беспр-ый, Дифф-ый, Аннуитетный"); // сделал для наглядности

        for (int i = 0; i < baseGraph.size(); i++) {
            System.out.printf("%d: %.2f, %.2f, %.2f %n", i + 1, baseGraph.get(i), difGraph.get(i), baseAnnuit.get(i));
        }

        System.out.printf("Переплата по каждому кредиту:%n %.2f  %.2f  %.2f", baseCredit.calculateOverpayment(), differentiateCredit.calculateOverpayment(), annuityCredit.calculateOverpayment());
    }
}