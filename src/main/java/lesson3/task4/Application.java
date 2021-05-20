package lesson3.task4;

public class Application {
    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human valeriy = new Human("Валерий");
        Human mikhail = new Human("Михаил");
        Human stanislav = new Human("Станислав");
        Human egor = new Human("Егор");
        Human grigoriy = new Human("Григорий");
        Human alexander = new Human("Александр");

        sergey.addFriend(valeriy);
        sergey.addFriend(grigoriy);
        stanislav.addFriend(valeriy);
        stanislav.addFriend(mikhail);
        egor.addFriend(alexander);
        egor.addFriend(grigoriy);
        alexander.addFriend(grigoriy);
        alexander.addFriend(mikhail);

        System.out.println(Application.areFriends(sergey, grigoriy));
        System.out.println(Application.areFriends(sergey, alexander));
        System.out.println(Application.areFriends(stanislav, mikhail));
        System.out.println(Application.areFriends(mikhail, valeriy));
    }

    public static boolean areFriends(Human first, Human second) {
        int areFriends = 0;
        for (Human human : first.friends) {
            if (human == second) areFriends++;
        }
        for (Human human : second.friends) {
            if (human == first) areFriends++;
        }
        return areFriends == 2 ? true : false;
    }
}