package lesson8.task3;

public class EleksnetTerminal extends Terminal {
    public EleksnetTerminal(String address) {
        super(address);
        owner = Owners.ELEKSNET;
        commission = 11;
        sumWithoutCommission = 300;
    }
}