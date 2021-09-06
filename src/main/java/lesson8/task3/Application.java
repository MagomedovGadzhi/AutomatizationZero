package lesson8.task3;

public class Application {
    public static void main(String[] args) {
        QiwiTerminal qiwi = new QiwiTerminal("г. Москва, ул. Проходчиков, д.3");
        qiwi.balanceUp("8(988)333-55-66", 100.7);
        qiwi.balanceUp("8(988)333-55-66", 1000);
        qiwi.balanceUp("8(988)333-55-66", 1000.5);

        EleksnetTerminal eleksnet1 = new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2");
        eleksnet1.balanceUp("8(988)333-55-66", -100);
        eleksnet1.balanceUp("8(988)333-55-66", 100.66);

        EleksnetTerminal eleksnet2 = new EleksnetTerminal("г. Москва, г. Москва, ул. Бакунинская, д.1");
        eleksnet2.balanceUp("8(988)333-55-66", 300);

        EleksnetTerminal eleksnet3 = new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4");
        eleksnet3.balanceUp("8(988)333-55-66", 0);

        TinkoffTerminal tinkoff = new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15");
        tinkoff.balanceUp("8(988)333-55-66", 50.55);
        tinkoff.balanceUp("8(988)333-55-66", 100);
        tinkoff.balanceUp("8(988)333-55-66", 500);
        tinkoff.balanceUp("8(988)333-55-66", 1000);
    }
}