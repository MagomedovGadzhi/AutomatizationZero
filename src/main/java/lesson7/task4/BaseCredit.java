package lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    protected double amount;          //сумма
    protected double rate;            //ставка
    protected int duration;        //длительность в месяцах

    public BaseCredit(double amount, double rate, int duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
    }

    public List<Double> getMonthPayments() {
        List<Double> paymentGraph = new ArrayList<>();
        for (int i = 0; i < duration; i++) {
            paymentGraph.add(amount / duration);
        }
        return paymentGraph;
    }

    public Double calculateOverpayment() {
        Double sum = 0d;
        for (Double monthPay : getMonthPayments()) {
            sum += monthPay;
        }
        return sum - this.amount;
    }
}