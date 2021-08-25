package lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class AnnuityCredit extends BaseCredit {
    public AnnuityCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments() {
        List<Double> paymentGraph = new ArrayList<>();
        double monthRate = rate / 12d / 100d;
        double annuityRate = (monthRate * Math.pow(1 + monthRate, duration)) / (Math.pow(1+monthRate, duration) -1);
        double payment = amount * annuityRate;
        for (int i = 0; i < duration; i++) {
            paymentGraph.add(payment);
        }
        return paymentGraph;
    }
}
