package lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class DifferentiateCredit extends BaseCredit {

    public DifferentiateCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments() {
        List<Double> paymentGraph = new ArrayList<>();
        Double debt = amount;
        for (int i = 0; i < duration; i++) {
            double rateSum = debt * rate / 100d / 12;
            double paymentSum = amount / duration + rateSum;
            debt = debt - (paymentSum - rateSum);
            paymentGraph.add(paymentSum);

        }
        return paymentGraph;
    }
}
