package lesson8.task3;

public class QiwiTerminal extends Terminal {
    public QiwiTerminal(String address) {
        super(address);
        owner = Owners.QIWI;
        commission = 7;
        sumWithoutCommission = 1000;
    }
}