package lesson8.task3;

public class TinkoffTerminal extends Terminal {
    protected double minSum = 100;

    @Override
    public void balanceUp(String telephoneNumber, double sum) {
        if (sum < minSum) {
            System.out.printf("Сумма пополнения: %.2f меньше минимально допустимой: %.2f%n", sum, minSum);
        } else {
            super.balanceUp(telephoneNumber, sum);
        }
    }

    public TinkoffTerminal(String address) {
        super(address);
        owner = Owners.TINKOFF;
        commission = 9;
        sumWithoutCommission = 600;
    }
}