package lesson8.task3;

public abstract class Terminal implements TopUpBalance {
    protected String address;
    protected Owners owner;
    protected double commission;
    protected double sumWithoutCommission;

    @Override
    public void balanceUp(String telephoneNumber, double sum) {
        if (sum<=0) {
            System.out.println("Сумма пополнения меньше либо равна 0");
            return;
        }
        double sumToUpBalance = sum >= sumWithoutCommission ? sum : sum - ((sum / 100) * commission);
        System.out.printf("Внесена сумма %.2f для пополнения телефона %s. Баланс пополнен на сумму %.2f. С уважением, ваш %s, %s%n",
                sum, telephoneNumber, sumToUpBalance, owner, address);
    }

    public Terminal(String address) {
        this.address = address;
    }
}